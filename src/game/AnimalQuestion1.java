package game;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javafx.fxml.FXML;
import javafx.geometry.Point2D;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
public class AnimalQuestion1 extends ArrayList<Question1>{

	private String[] qs;  // questions
	private String [] as; // answer
	private TextField word1;
	private Button button;
<<<<<<< HEAD
//	 String[] err = {"error"};
//	  //String[] ans1 = {"fart", "dream", "cry", "have night vision", "see colors"};
//	  List<String> ans1 = Arrays.asList("fart", "dream", "cry", "have night vision", "see colors");
//	  String[] ans2 = {"sleep", "get thirsty", "drink water", "stop swimming", "have feelings"};
//	  String[] ans3 = {"depressed", "hungry", "bored", "overweight", "happy"};
//	  String[] ans4 = {"service dog", "fox", "badger", "baby deer", "bird"};
//	  String[] ans5 = {"shoes", "homework", "clothes", "edible", "medicine"};
//	  String[] ans6 = {"noses wet", "loyal", "scared of fireworks", "better than cats", "so cute"};
//	  String[] ans7 = {"sick", "pregnant", "happy", "molting", "choking"};
//	  String[] ans8 = {"lions", "anacondas", "mokeys", "stray cats", "bears"};
//	  String[] ans9 = {"hunt in packs", "bark", "howl", "eat plants", "live near me"};
//	  String[] ans10 = {"slither", "breathe through their nose", "have bones", "have ears", "eat rabbits"};
//	 
=======
	 String[] err = {"error"};
	  //String[] ans1 = {"fart", "dream", "cry", "have night vision", "see colors"};
	  List<String> ans1 = Arrays.asList("fart", "dream", "cry", "have night vision", "see colors");
	  String[] ans2 = {"sleep", "get thirsty", "drink water", "stop swimming", "have feelings"};
	  String[] ans3 = {"depressed", "hungry", "bored", "overweight", "happy"};
	  String[] ans4 = {"service dog", "fox", "badger", "baby deer", "bird"};
	  String[] ans5 = {"shoes", "homework", "clothes", "edible", "medicine"};
	  String[] ans6 = {"noses wet", "loyal", "scared of fireworks", "better than cats", "so cute"};
	  String[] ans7 = {"sick", "pregnant", "happy", "molting", "choking"};
	  String[] ans8 = {"lions", "anacondas", "mokeys", "stray cats", "bears"};
	  String[] ans9 = {"hunt in packs", "bark", "howl", "eat plants", "live near me"};
	  String[] ans10 = {"slither", "breathe through their nose", "have bones", "have ears", "eat rabbits"};
	 
>>>>>>> refs/remotes/origin/main
	
	
	//TextField word_input = (word_in);
	 
	
<<<<<<< HEAD

		
=======
<<<<<<< HEAD
		 public AnimalQuestion1() {
		       
		    }
	@FXML
=======
>>>>>>> refs/remotes/origin/main
		 public AnimalQuestion1() {}
	
<<<<<<< HEAD

=======
>>>>>>> branch 'main' of https://github.com/ewsavard/comp2final.git
>>>>>>> refs/remotes/origin/main
	  public String getQuestion() throws IOException{
		  String[] myList = {"Do cats...?", "Do  fish ever...?", "Is my cat...?", "Can you pet a...?", "My dog ate my...", "Why are dogs..?", "Is my bird...?", "Where do ____ live?", "Do wolves...?", "Do snakes...?"};
		  this.qs = myList;
		  Random r = new Random();
		  int i = r.nextInt(0, myList.length);
		 return myList[i];
		  
		//  (myList);
	  
	  }
	 
	  
	
	  
	  public String[] getAnswers(String s) {
		  
		  String[] err = {"error"};
		  String[] ans1 = {"fart", "dream", "cry", "have night vision", "see colors"};
		  String[] ans2 = {"sleep", "get thirsty", "drink water", "stop swimming", "have feelings"};
		  String[] ans3 = {"depressed", "hungry", "bored", "overweight", "happy"};
		  String[] ans4 = {"service dog", "fox", "badger", "baby deer", "bird"};
		  String[] ans5 = {"shoes", "homework", "clothes", "edible", "medicine"};
		  String[] ans6 = {"noses wet", "loyal", "scared of fireworks", "better than cats", "so cute"};
		  String[] ans7 = {"sick", "pregnant", "happy", "molting", "choking"};
		  String[] ans8 = {"lions", "anacondas", "mokeys", "stray cats", "bears"};
		  String[] ans9 = {"hunt in packs", "bark", "howl", "eat plants", "live near me"};
		  String[] ans10 = {"slither", "breathe through their nose", "have bones", "have ears", "eat rabbits"};
		  
		  this.as = ans1;
		  this.as = ans2;
		  this.as = ans3;
		  this.as = ans4;
		  this.as = ans5;
		  this.as = ans6;
		  this.as = ans7;
		  this.as = ans8;
		  this.as = ans9;
		  this.as = ans10;
		
		  
		  if (s.equals(qs[0])) {
			  return ans1;
		  }
		  else if (s.equals(qs[1])) {
			  return ans2; 
		  }
		  else if (s.equals(qs[2])) {
			  return ans3; 
		  }
		  else if(s.equals(qs[3])) {
			  return ans4;
		  }
		  else if(s.equals(qs[4])) {
			  return ans5; 
		  }
		  else if(s.equals(qs[5])) {
			  return ans6; 
		  }
		  else if(s.equals(qs[6])) {
			  return ans7; 
		  }
		  else if (s.equals(qs[7])){
			  return ans8; 
		  }
		  else if(s.equals(qs[8])) {
			  return ans9; 
		  }
		  else if(s.equals(qs[9])) {
			  return ans10; 
		  }
		  return err;
		    
	  }
	  
<<<<<<< HEAD
	  
	  

=======
	  public void Validate_word ( TextField  text_field) {
		  
		//  String word = text_field.getText();
		  //scene.setFill(c)
		  
		  if(text_field.contains((Point2D) ans1)) {
			  button.setStyle("-fx-background-color: transparent");
		 
		  }else {
			 
		        button.setTextFill(Color.BLUE);
		        
		  }
		  
			  
		  }
	   	
	  
	  
	  
	 
//>>>>>>> refs/remotes/origin/main
>>>>>>> refs/remotes/origin/main
}  
