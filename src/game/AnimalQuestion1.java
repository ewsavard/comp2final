package game;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javafx.scene.text.Text;
public class AnimalQuestion1 extends ArrayList<Question1>{
	
	private String[] qs;
	
		 public AnimalQuestion1() {}
	
	  public String getQuestion() throws IOException{
		  String[] myList = {"Do cats...?", "Do  fish ever...?", "Is my cat...?", "Can you pet a...?", "My dog ate my...", "Why are dogs..?", "Is my bird...?", "Where do ____ live?", "Do wolves...?", "Do snakes...?"};
		  this.qs = myList;
		  Random r = new Random();
		  int i = r.nextInt(0, myList.length);
		  return myList[i];
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
}  
