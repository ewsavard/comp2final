package game;

import java.awt.Taskbar.State;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.Action;
import javax.swing.JButton;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Text;
public class Scene_Controller_Class {
	
	
	
	
	

	public Stage stage;
	private Scene scene; 
	private Parent parent_roots; 

	
	
	public void switch_to_culture(ActionEvent event) throws IOException{
		JButton culture =  new JButton("Culture");
		Parent new_window_parent = FXMLLoader.load(getClass().getResource("CultureScreeen.fxml"));
		culture.setAction((Action) this);
		Scene new_window_scene = new Scene (new_window_parent);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(new_window_scene);
		stage.show();
	}
	
	public void switch_to_animal(ActionEvent event) throws IOException{
		JButton Animal =  new JButton("Animal");
		Parent new_window_parent = FXMLLoader.load(getClass().getResource("animal.fxml"));
		Animal.setAction((Action) this);
		Scene  new_window_scene = new Scene (new_window_parent);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(new_window_scene);
		stage.show();
	}
	public void switch_to_food(ActionEvent event) throws IOException{
		JButton food =  new JButton("Food");
		Parent new_window_parent = FXMLLoader.load(getClass().getResource("food.fxml"));
		food.setAction((Action) this);
		Scene  new_window_scene = new Scene (new_window_parent);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(new_window_scene);
		stage.show();
	}
	public void switch_to_people(ActionEvent event) throws IOException{
		JButton people =  new JButton("People");
		people.setAction((Action) this);
		Parent new_window_parent = FXMLLoader.load(getClass().getResource("people.fxml"));
		Scene  new_window_scene = new Scene (new_window_parent);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(new_window_scene);
		stage.show();
	}
		
	
	

}
