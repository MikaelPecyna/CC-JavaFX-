package Question4;
 


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class JeuFonctionnel extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        
        
    	
    	HBox playerControls = new HBox(); 
    	
    	Region ressort = new Region();
        HBox.setHgrow(ressort,Priority.ALWAYS);
        
        PointChoiceActif j1 = new PointChoiceActif(2, 4); 
        PointChoiceActif j2 = new PointChoiceActif(2, 4);
        
        TextField j1tf = new TextField();
        TextField j2tf = new TextField();
        
        
        VBox j1Full = new VBox(); 
        VBox.setMargin(j1tf, new Insets(0, 0, 20, 0));
        j1Full.getChildren().addAll(j1tf, j1); 

        VBox j2Full = new VBox(); 
        VBox.setMargin(j2tf, new Insets(0, 0, 20, 0));
        j2Full.getChildren().addAll(j2tf, j2); 
        
        playerControls.getChildren().addAll(j1Full, ressort, j2Full);
    	
        
        PlayGrid grid = new PlayGrid(10, 10);
        
        Label j1Lab = new Label(" J1 "); 
        j1Lab.setStyle("-fx-background-color: yellow; ");

        Label j2Lab = new Label(" J2 "); 
        j2Lab.setStyle("-fx-background-color: red ; ");
        
        grid.add(j1Lab, 3, 4);
        grid.add(j2Lab, 3, 1);
        BorderPane.setAlignment(grid, Pos.TOP_CENTER);;
        
        
        
        
        BorderPane root = new BorderPane();
        root.setBottom(playerControls);
        root.setCenter(grid);
        
        
        
        
        
        
        
        
        
        
        
        primaryStage.setScene(new Scene(root, 650, 550));
        primaryStage.setTitle("les deux joueurs");
        primaryStage.show();
    }
}