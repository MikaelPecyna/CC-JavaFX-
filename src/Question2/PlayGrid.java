package Question2;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class PlayGrid extends GridPane{

	public PlayGrid(int right, int down) {
		super(); 
		
		for( int y = 0 ; y < right  ; y++) {
	        for( int x = 0 ; x < down ; x++) {
	            Label tmp = new Label();
	            tmp.setMinSize(40, 40);
	            tmp.setMaxSize(40, 40);
	            tmp.setStyle("-fx-border-color : black");
	            this.add(tmp, x, y);
	        }
	    }
		this.setStyle("-fx-border-color: yellow; ");
		this.setMinSize(400, 400);
		this.setMaxSize(400, 400);
	}
	
	

}


