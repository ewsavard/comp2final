package game;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.geometry.Point2D;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class CultureQuestion1 extends ArrayList<Question1> {
	
	private String[] qs; 
	private TextField word1;
	private Button button;
	
	String[] err = {"error"}; 
	String[] ans1 = {"water", "wine", "ice", "cider", "image carwash"};
	String[] ans2 = {"one", "mcgee", "ghibli", "apartment", "space"};
	String[] ans3 = {"Gatsby", "escape", "depression", "raid", "outdoors"};
	String[] ans4 = {"polly", "brother", "brother, where art thou?", "my baby", "polly dress"};
	String[] ans5 = {"homeless", "poor", "stupid", "dumb", "no"};
	String[] ans6 = {"gas", "carrot cake near me", "diesel fuel", "car batteries", "quality diesel fuel"};
	String[] ans7 = {"potatoes", "taller", "garlic", "your hair faster", "strawberries"};
	String[] ans8 = {"life", "friendship", "depression", "love", "nature"};
	String[] ans9 = {"better than private", "funded by", "run by", "failing", "the great equalizer"};
	String[] ans10 = {"cake", "latte", "recipe", "creamer", "coffee"}; 
	
	
	    public CultureQuestion1() {}
	  
	    public String getQuestion() {
	    	String[] myList = {"Sparkling...", "Studio...", "The Great...", "Oh...", "Nicer way to say...", "Who sells the best...", "How to grow...", "Poems about...", "Public schools are...", "Pumpkin spice..."};
	    	this.qs = myList;
	    	Random r = new Random();
	    	int i = r.nextInt(0, myList.length); 
	    	return myList[i];
	    } 
	    
	    public String[] getAnswers(String s) {
	    	String[] err = {"error"}; 
	    	String[] ans1 = {"water", "wine", "ice", "cider", "image carwash"};
	    	String[] ans2 = {"one", "mcgee", "ghibli", "apartment", "space"};
	    	String[] ans3 = {"Gatsby", "escape", "depression", "raid", "outdoors"};
	    	String[] ans4 = {"polly", "brother", "brother, where art thou?", "my baby", "polly dress"};
	    	String[] ans5 = {"homeless", "poor", "stupid", "dumb", "no"};
	    	String[] ans6 = {"gas", "carrot cake near me", "diesel fuel", "car batteries", "quality diesel fuel"};
	    	String[] ans7 = {"potatoes", "taller", "garlic", "your hair faster", "strawberries"};
	    	String[] ans8 = {"life", "friendship", "depression", "love", "nature"};
	    	String[] ans9 = {"better than private", "funded by", "run by", "failing", "the great equalizer"};
	    	String[] ans10 = {"cake", "latte", "recipe", "creamer", "coffee"}; 
	    	if(s.equals(qs[0])) {
	    		return ans1; 
	    	}
	    	else if(s.equals(qs[1])) {
	    		return ans2; 
	    	}
	    	else if(s.equals(qs[2])) {
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
	    	else if(s.equals(qs[7])) {
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
	    
	  ///  public void Validate_word ( TextField  text_field) {
			  
			//  String word = text_field.getText();
			  //scene.setFill(c)
			  
			//  if(text_field.contains((Point2D) validWords)) {
			//	  button.setStyle("-fx-background-color: transparent");
			 
			///  }else {
				 
			 //       button.setTextFill(Color.BLUE);
			        
			 // }
	    
	//}
