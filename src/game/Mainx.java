package game;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Mainx extends Application implements Initializable{

	@FXML
	//Button AnimalCategory;

	@Override
	public void start(Stage primaryStage) {



		try {
			//BorderPane root = new BorderPane();

			final Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
			Scene scene = new Scene(root,400,400);
			//scene.getStylesheets().add(getClass().getResource("Main").toExternalForm());



			//AnimalCategory.setOnAction(e-> scene.setFill(Color.BLACK));

			primaryStage.setTitle("Foogle Geud!");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
}
