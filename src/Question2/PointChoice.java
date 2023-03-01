package Question2;



import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class PointChoice extends VBox{

	public PointChoice(int x, int y)  {
		super(); 
		
		Label coord = new Label("(" + x + ";" + y + ")");
		
		
		
		GridPane changeCoord = new GridPane();
		changeCoord.setVgap(5);
		changeCoord.setHgap(5);
		
		Button xPlus = new Button(" + "); 
		Button xMoins = new Button(" - "); 

		Button yPlus = new Button(" + "); 
		Button yMoins = new Button(" - "); 
		
		changeCoord.add(xPlus, 0, 0);
		changeCoord.add(xMoins, 0,1);
		changeCoord.add(yPlus, 1, 0);
		changeCoord.add(yMoins, 1, 1);
		
		
		
		
		this.setPadding(new Insets(10));
		this.getChildren().addAll(coord, changeCoord);
		
	}

}
