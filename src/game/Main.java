package game;


import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.Action;
import javax.swing.JButton;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application implements Initializable{
	@FXML
	//Button AnimalCategory;
	
	public Stage stage;
	private Scene scene; 
	private Parent root; 

	@Override
	public void start(Stage primaryStage) {



		try {
			//BorderPane root = new BorderPane();
			Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
			Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("Main").toExternalForm());



			//AnimalCategory.setOnAction(e-> scene.setFill(Color.BLACK));

			//primaryStage.setTitle("Foogle Geud!");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	//@FXML
	public void switching_to_culture_first(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene (root);
		stage.setScene(scene);
		stage.show();
	}
	@FXML
	public void switching_to_scenes(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("animalsfxml.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		//scene = new Scene (root);
		stage.setScene(scene);
		stage.show();
	}
	/*
	@FXML
	public void switch_to_culture(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("culturefxml.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene (root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void switch_to_animal(ActionEvent event) throws IOException{
		JButton Animal =  new JButton("Animal");
		Parent new_window_parent = FXMLLoader.load(getClass().getResource("animalsfxml.fxml"));
		Animal.setAction((Action) this);
		Scene  new_window_scene = new Scene (new_window_parent);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(new_window_scene);
		stage.show();
	}
	@FXML
	public void switch_to_food(ActionEvent event) throws IOException{
		JButton food =  new JButton("Food");
		Parent new_window_parent = FXMLLoader.load(getClass().getResource("foodfxml.fxml"));
		food.setAction((Action) this);
		Scene  new_window_scene = new Scene (new_window_parent);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(new_window_scene);
		stage.show();
	}
	@FXML
	public void switch_to_people(ActionEvent event) throws IOException{
		JButton people =  new JButton();
		people.setAction((Action) this);
		Parent new_window_parent = FXMLLoader.load(getClass().getResource("peoplefxml.fxml"));
		Scene  new_window_scene = new Scene (new_window_parent);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(new_window_scene);
		stage.show();
	}
	
	
	
	
	*/



}


