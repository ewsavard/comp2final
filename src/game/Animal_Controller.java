package game;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

public class Animal_Controller extends Application implements Initializable {

	public Animal_Controller() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public void Question_random() throws IOException{
	    ArrayList<String> my_list = new ArrayList<String>();
	    my_list.add("Do cats");
	    my_list.add("Do  fish ever");
	    my_list.add("Is my cat ");
	    my_list.add("My dog ate my");
	    my_list.add("Why are dogs");
	    my_list.add("Is my bird");
	    my_list.add("Where do ____ live");
	    my_list.add("Do wolves");
	    my_list.add("Do snakes");
	    
	    Collections.shuffle(my_list); 
	    
	    
	    for (String random_values : my_list) 
        { 
          if(random_values.equals("Do cats")) {
        	  
        	  
          }
        }
	    
	    
	}

}
