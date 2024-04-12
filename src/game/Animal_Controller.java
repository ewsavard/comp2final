package game;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*public class Animal_Controller extends Application implements Initializable {
	TextField myTextField;
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
	

<<<<<<< HEAD
	
		
	
=======
	public void Question_random() throws IOException {
		
		
		String[] my_list = {"Do cats","Do  fish ever"};
		String[] my_answers = {"poop ","sleep"};
	
		
		
		ArrayList<String> my_lis2t = new ArrayList<String>();
		
		
		if (my_list.equals(my_answers)) {
			
			
			
			
		}

		Collections.shuffle(my_list); // this is the random aspect of this question:

		for (String random_values : my_list) {
			if (random_values.equals("Do cats ")) {
				int i = my_list.indexOf(random_values);
				Text question = new Text(String.format("%s", my_list.get(i)));
				System.out.print(i);
				System.out.print(random_values);

				new ArrayList<>(List.of("fart", "dream", "cry", "have night vision", "see colors"));

			}
		}
	}
>>>>>>> branch 'main' of https://github.com/ewsavard/comp2final

}

