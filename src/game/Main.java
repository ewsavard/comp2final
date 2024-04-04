package game;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	@Override
	public void start(Stage home_Page) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("gameUIStart.fxml"));
		Scene scene = new Scene(root);
		home_Page.setScene(scene);
		home_Page.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
