package game;

import java.awt.event.ActionEvent;
import java.io.IOException;

<<<<<<< HEAD
=======
import javax.swing.Action;
import javax.swing.JButton;

import javafx.application.Application;
>>>>>>> branch 'main' of https://github.com/ewsavard/comp2final.git
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Scene_Controller_Class {

	
	

	public Stage stage;
	private Scene scene; 
	private Parent parent_roots; 
	private Stage stage;
	private Scene scene;
	private Parent parent_roots;



	public void switch_to_scene1(ActionEvent event) throws IOException{
		final FXMLLoader loader = new FXMLLoader(getClass().getResource("gameUIStart.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(parent_roots);
		stage.setScene(scene);
		stage.show();
	}
	public void switch_to_scene2(ActionEvent event) {
		final FXMLLoader loader = new FXMLLoader(getClass().getResource("Second_scene.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(parent_roots);
		stage.setScene(scene);
		stage.show();

	}
	public void switch_to_scene3(ActionEvent event) throws IOException	{
		final FXMLLoader loader = new FXMLLoader(getClass().getResource("ThirdScene.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(parent_roots);
		stage.setScene(scene);
	
	
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
		JButton food =  new JButton("food");
		Parent new_window_parent = FXMLLoader.load(getClass().getResource("animal.fxml"));
		food.setAction((Action) this);
		Scene  new_window_scene = new Scene (new_window_parent);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(new_window_scene);
		stage.show();
	}
	public void switch_to_people(ActionEvent event) throws IOException{
		JButton people =  new JButton("people");
		people.setAction((Action) this);
		Parent new_window_parent = FXMLLoader.load(getClass().getResource("people.fxml"));
		Scene  new_window_scene = new Scene (new_window_parent);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(new_window_scene);
		stage.show();
	}
		
	
}
