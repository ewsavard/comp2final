package game;

import java.awt.Taskbar.State;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Text;
public class Scene_Controller_Class {
	
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
		stage.show();
	}
	
	
	
	
	

	
	

}
