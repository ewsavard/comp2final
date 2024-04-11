package game;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
			Collections.shuffle(animalQuestions);
			for (Question1 random_values : animalQuestions) 
		    {
				int index = animalQuestions.indexOf(random_values);
				
				
		    }
			
			return animalQuestions;
		
		
		
	    
	    }
	    // text boxes in fxml ONce import used .setText
	
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
    
    Collections.shuffle(my_list); // this is the random aspect of this question:
    
    
    for (String random_values : my_list) 
    { 
      if(random_values.equals("Do cats ")) {
    	  int i = my_list.indexOf(random_values);
    	  Text question = new Text(String.format("%s", my_list.get(i)));
    	  System.out.print(i);
    	  System.out.print(random_values);
    	  
    	  
    	  //new ArrayList<>(List.of("fart", "dream", "cry", "have night vision", "see colors"));
  		
    	  
      		}
    	}
	  }
}  
