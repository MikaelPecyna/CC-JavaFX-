package Question4;



import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class PointChoice extends VBox{
	
	Button xPlus; 
	Button yPlus; 
	Button xMoins; 
	Button yMoins; 
	Label coord;
	
	

	int x; 
	int y; 

	public PointChoice(int x, int y)  {
		super(); 
		
		this.coord = new Label("(" + x + ";" + y + ")");
		this.x = x;
		this.y = y; 
		
		
		
		
		
		GridPane changeCoord = new GridPane();
		changeCoord.setVgap(5);
		changeCoord.setHgap(5);
		
		this.xPlus = new Button(" + "); 
		this.xMoins = new Button(" - "); 

		this.yPlus = new Button(" + "); 
		this.yMoins = new Button(" - "); 
		
		
		
		
		changeCoord.add(this.xPlus, 0, 0);
		changeCoord.add(this.xMoins, 0,1);
		changeCoord.add(this.yPlus, 1, 0);
		changeCoord.add(this.yMoins, 1, 1);
		
		
		
		
		this.setPadding(new Insets(10));
		this.getChildren().addAll(this.coord, changeCoord);
		
	}
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Label getCoord() {
		return coord;
	}

	public void setCoord(Label coord) {
		this.coord = coord;
	}

}
