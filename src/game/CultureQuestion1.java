package game;
import java.util.ArrayList;
import java.util.List;

public class CultureQuestion1 extends ArrayList<Question1> {
	    public CultureQuestion1(String question, ArrayList<String> answers) {
	        add(new Question1(question, answers));
	    }
	   
		  
	    
	    // Define culture questions
	    public static CultureQuestion1 defineCultureQuestions() {
	       
	    	CultureQuestion1 cultureQuestions = new CultureQuestion1("", new ArrayList<>());
	        cultureQuestions.add(new Question1("Sparkling ____",
	                new ArrayList<>(List.of("water", "wine", "ice", "cider", "image carwash"))));
	        cultureQuestions.add(new Question1("Studio ____",
	                new ArrayList<>(List.of("one", "mcgee", "ghibli", "apartment", "space"))));
	        cultureQuestions.add(new Question1("The Great ____",
	                new ArrayList<>(List.of("Gatsby", "escape", "depression", "raid", "outdoors"))));
	        cultureQuestions.add(new Question1("Oh ____",
	                new ArrayList<>(List.of("polly", "brother", "brother, where art thou?", "my baby", "polly dress"))));
	        cultureQuestions.add(new Question1("Nicer way to say ____",
	                new ArrayList<>(List.of("homeless", "poor", "stupid", "dumb", "no"))));
	        cultureQuestions.add(new Question1("Who sells the best ____",
	                new ArrayList<>(List.of("gas", "carrot cake near me", "diesel fuel", "car batteries", "quality diesel fuel"))));
	        cultureQuestions.add(new Question1("How to grow ____",
	                new ArrayList<>(List.of("potatoes", "taller", "garlic", "your hair faster", "strawberries"))));
	        cultureQuestions.add(new Question1("Poems about ____",
	                new ArrayList<>(List.of("life", "friendship", "depression", "love", "nature"))));
	        cultureQuestions.add(new Question1("Public schools are ____",
	                new ArrayList<>(List.of("better than private", "funded by", "run by", "failing", "the great equalizer"))));
	        cultureQuestions.add(new Question1("Pumpkin spice ____",
	                new ArrayList<>(List.of("cake", "latte", "recipe", "creamer", "coffee"))));
	        return cultureQuestions;
	    
	        
	        
	         }
	}
