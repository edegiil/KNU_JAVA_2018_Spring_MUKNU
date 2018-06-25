package application.view;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
	
	//GUI화면
    public static String mainID = "main";
    public static String mainFile = "Main.fxml";
    public static String categoryID = "category";
    public static String categoryFile = "Category.fxml";
    public static String randomID = "random";
    public static String randomFile = "Random.fxml";
    public static String restaurantID = "restaurant";
    public static String restaurantFile = "Restaurant.fxml";    
    public static String mapID = "map";

    Stage stage;
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        
    	ScreensController mainContainer = new ScreensController();
    	
    	//GUI화면 불러오기
    	mainContainer.loadScreen(Main.mainID, Main.mainFile);
    	mainContainer.loadScreen(Main.categoryID, Main.categoryFile);
    	mainContainer.loadScreen(Main.randomID, Main.randomFile);
    	mainContainer.loadScreen(Main.restaurantID, Main.restaurantFile);
    	mainContainer.loadMap(Main.mapID); //지도화면 불러오기
    	
		mainContainer.setScreen(Main.mainID);
		
		Group root = new Group();
		root.getChildren().addAll(mainContainer);
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.getIcons().add(new Image("File:src/application/view/img/icon.png")); //아이콘 불러오기
		
		stage.setTitle("MUKNU"); //프로그램 이름
		stage.show();
    } 
}