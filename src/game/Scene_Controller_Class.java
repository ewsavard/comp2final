package game;

import javafx.event.ActionEvent;
import java.io.IOException;


import javax.swing.Action;
import javax.swing.JButton;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
public class Scene_Controller_Class {

	
	


	public Stage stage;
	private Scene scene; 
	private Parent root; 
	


	public void switching_to_scenes(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene (root);
		stage.setScene(scene);
		stage.show();
	}
	
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
	
	
	
	
	
	


}


