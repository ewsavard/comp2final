package game;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javafx.scene.text.Text;
public class AnimalQuestion1 extends ArrayList<Question1>{
		 public AnimalQuestion1(String question, ArrayList<String> answers) {
		        add(new Question1(question, answers));
		    }
	    public static AnimalQuestion1 defineAnimalQuestions() {
	        AnimalQuestion1 animalQuestions = new AnimalQuestion1("", new ArrayList<>());
	        
	        if (animalQuestions.equals("Do cats ____?")) {
	        	
	        	new ArrayList<>(List.of("fart", "dream", "cry", "have night vision", "see colors"));
	        	
	        
	        	

	        }
	        animalQuestions.add(new Question1("Do cats ____?", 
					new ArrayList<>(List.of("fart", "dream", "cry", "have night vision", "see colors"))));
			animalQuestions.add(new Question1("Do fish ever ____?", 
					new ArrayList<>(List.of("sleep", "get thirsty", "drink water", "stop swimming", "have feelings"))));
			animalQuestions.add(new Question1("Is my cat ____?", 
					new ArrayList<>(List.of("depressed", "hungry", "bored", "overweight", "happy"))));
			animalQuestions.add(new Question1("Can you pet a ____?", 
					new ArrayList<>(List.of("service dog", "fox", "badger", "baby deer", "bird"))));
			animalQuestions.add(new Question1("My dog ate my ____", 
					new ArrayList<>(List.of("shoes", "homework", "clothes", "edible", "medicine"))));
			animalQuestions.add(new Question1("Why are dogs ____?", 
					new ArrayList<>(List.of("noses wet", "loyal", "scared of fireworks", "better than cats", "so cute"))));
			animalQuestions.add(new Question1("Is my bird ____?", 
					new ArrayList<>(List.of("sick", "pregnant", "happy", "molting", "choking"))));
			animalQuestions.add(new Question1("Where do ____ live?", 
					new ArrayList<>(List.of("lions", "anacondas", "mokeys", "stray cats", "bears"))));
			animalQuestions.add(new Question1("Do wolves ____?", 
					new ArrayList<>(List.of("hunt in packs", "bark", "howl", "eat plants", "live near me"))));
			animalQuestions.add(new Question1("Do snakes ____?", 
					new ArrayList<>(List.of("slither", "breathe through their nose", "have bones", "have ears", "eat rabbits"))));
			return animalQuestions;
			
	    }
		 
		  
	
    
    
     // this is the random aspect of this question:
    
    
    
    	  
    	  
    	  //new ArrayList<>(List.of("fart", "dream", "cry", "have night vision", "see colors"));
  		
	  
	  
    	
	  
}  
