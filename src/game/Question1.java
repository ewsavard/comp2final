package game;

import java.util.ArrayList;

public class Question1 {
	    private String question;
	    private ArrayList<String> answers;

	    public Question1(String question, ArrayList<String> answers) {
	        this.question = question;
	        this.answers = answers;
	    }

	    public String getQuestion() {
	        return question;
	    }

	    public ArrayList<String> getAnswers() {
	        return answers;
	    }
	    
	    //Check is user input is correct for culture
	    public boolean cultureInputIsCorrect(ArrayList<Question> cultureQuestions, String userInput) {
	    	if (cultureQuestions != null && cultureQuestions.size() > 0) {
	            if (cultureQuestions.get(0) != null) { 
	            if (userInput.matches("(?i)(water|wine|ice|cider|image carwash)")) {
	                return true; 
	            }
	            } 
	            if (cultureQuestions.get(1) != null) { 
	                if (userInput.matches("(?i)(one|mcgee|ghibli|apartment|space)")) {
	                    return true; 
	                }
	            }
	            if (cultureQuestions.get(2) != null) { 
	                if (userInput.matches("(?i)(Gatsby|escape|depression|raid|outdoors)")) {
	                    return true; 
	                }
	                } 
	            if (cultureQuestions.get(3) != null) { 
	                if (userInput.matches("(?i)(polly|brother|my baby|polly dress)")) {
	                    return true; 
	                }
	                } 
	            if (cultureQuestions.get(4) != null) { 
	                if (userInput.matches("(?i)(homeless|poor|stupid|dumb|no)")) {
	                    return true; 
	                }
	                } 
	            if (cultureQuestions.get(5) != null) { 
	                if (userInput.matches("(?i)(gas|carrot cake|fuel|car batteries)")) {
	                    return true; 
	                }
	                } 
	            if (cultureQuestions.get(6) != null) { 
	                if (userInput.matches("(?i)(taller|potatoes|potato|tall|garlic|hair|strawberries)")) {
	                    return true; 
	                }
	                } 
	            if (cultureQuestions.get(7) != null) { 
	                if (userInput.matches("(?i)(life|friendship|despression|love|nature)")) {
	                    return true; 
	                }
	                } 
	            if (cultureQuestions.get(8) != null) { 
	                if (userInput.matches("(?i)(better than private|funded|failing|run|the great equalizer)")) {
	                    return true; 
	                }
	                } 
	            if (cultureQuestions.get(9) != null) { 
	                if (userInput.matches("(?i)(cake|latte|recipe|creamer|coffee)")) {
	                    return true; 
	                }
	                } 
	        }
	        return false;
			} 
	  
	  //Check is user input is correct for people
	    public boolean peopleInputIsCorrect(ArrayList<Question> peopleQuestions,String userInput) {
	    	if (peopleQuestions != null && peopleQuestions.size() > 0) {
	    		if (peopleQuestions.get(0) != null) {
	    		if (userInput.matches("(?i)(brother|dog|birthday|phone number|wife)+")){
	            	return true;
	        	}	
	    		}
	    		if (peopleQuestions.get(1) != null) {
	    		if (userInput.matches("(?i)(barbara streisand|Barbara Streisand|Ben Shapiro|ben shapiro|Nicole Kidman|nicole kidman|Justin Timberlake|justin timberlake|Keith Urban|keith urban)")){
	            	return true;
	        	}
	    		}
	    		if (peopleQuestions.get(2) != null) {
	        	if (userInput.matches("(?i)(snore|yearn|cheat|say bless you|bless you|get hiccups|hiccup)+")){
	            	return true;
	        	}
	    		}
	    		if (peopleQuestions.get(3) != null) {
	        	if (userInput.matches("(?i)(hero|life|rock)")){
	            	return true;
	        	}
	    		}
	    		if (peopleQuestions.get(4) != null) {
	        	if (userInput.matches("(?i)(angry|mean|clingy|hyper)")){
	            	return true;
	        	}
	    		}
	        	if (peopleQuestions.get(5) != null) {
	        	if (userInput.matches("(?i)(Simmons|simmons|Affleck|affleck|franklin|Franklin|and Jerry's|and jerrys|and jerry's|Stiller|stiller)")){
	            	return true;
	        	}
	        	}
	        	if (peopleQuestions.get(6) != null) {
	        	if (userInput.matches("(?i)(bush|Bush|Clinton|clinton|Obama|obama|Trump|trump|Biden|biden)")){
	            	return true;
	        	}
	        	}
	        	if (peopleQuestions.get(7) != null) {
	        	if (userInput.matches("(?i)(sexy|drunk to taste this chicken|good at goodbyes)")){
	            	return true;
	        	}
	        	}
	        	if (peopleQuestions.get(8) != null) {
	        	if (userInput.matches("(?i)(makeup|make up|bras|dresses|waistbeads|waist beads| heels)")){
	            	return true;
	        	}
	        	}
	        	if (peopleQuestions.get(9) != null) {
	        	if (userInput.matches("(?i)(like beef|pennies|burnt toast|gas|toast)")){
	            	return true;
	        	}
	    	}
	    	}
	        	return false;
	    }
	  //Check is user input is correct for animal
	    public boolean animalInputIsCorrect(ArrayList<Question> animalQuestions,String userInput) {
	    	if (animalQuestions != null && animalQuestions.size() > 0) {
	    		if (animalQuestions.get(0) != null) {
	    		if (userInput.matches("(?i)(fart|dream|see color|see colors|have night vision|cry)+")){
	        	return true;
	    	}
	    		}
	    		if (animalQuestions.get(1) != null) {
	    		if (userInput.matches("(?i)(sleep|get thirsty|drink water|stop swimming|have feelings)")){
	        	return true;
	    	}
	    		}
	    		if (animalQuestions.get(2) != null) {
	    	if (userInput.matches("(?i)(depressed|hungry|bored|overweight|happy)+")){
	        	return true;
	    	}
	    		}
	    	if (animalQuestions.get(3) != null) {
	    	if (userInput.matches("(?i)(service dog|fox|badge|deer|bird)")){
	        	return true;
	    	}
	    	}
	    	if (animalQuestions.get(4) != null) {
	    	if (userInput.matches("(?i)(shoes|homework|clothes|edible|medicine)")){
	        	return true;
	    	}
	    	}
	    	if (animalQuestions.get(5) != null) {
	    	if (userInput.matches("(?i)(noses wet|loyal|scared of fireworks|better than cats|cute)")){
	        	return true;
	    	}
	    	}
	    	if (animalQuestions.get(6) != null) {
	    	if (userInput.matches("(?i)(sick|pregnant|happy|molting|choking)")){
	        	return true;
	    	}
	    	}
	    	if (animalQuestions.get(7) != null) {
	    	if (userInput.matches("(?i)(lions|anacondas|monkeys|stray cats|bears)")){
	        	return true;
	    	}
	    	}
	    	if (animalQuestions.get(8) != null) {
	    	if (userInput.matches("(?i)(hunt|bark|howl|eat plants|live near me)")){
	        	return true;
	    	}
	    	}
	    	if (animalQuestions.get(9) != null) {
	    	if (userInput.matches("(?i)(slither|breathe|bones|eat rabbits)")){
	        	return true;
	    	}
	            	}	
	        }
	        	return false;
	    }
	  //Check is user input is correct for food
	    public boolean foodInputIsCorrect(ArrayList<Question> foodQuestions,String userInput) {
	        if (foodQuestions != null && foodQuestions.size() > 0) {
	        	if (foodQuestions.get(0) != null) {
	        	if (userInput.matches("(?i)(chip|cookie|milk|cookie recipe|ice cream)+")){
	            	return true;
	        	}
	        	}	
	        	if (foodQuestions.get(1) != null) {
	        	if (userInput.matches("(?i)(food|mayo|ramen|noodles|chicken)")){
	            	return true;
	        	}
	        	}
	        	if (foodQuestions.get(2) != null) {
	        	if (userInput.matches("(?i)(wear hats|say all day|shallots|have tattoos|like cooking)+")){
	            	return true;
	        	}
	        	}
	        	if (foodQuestions.get(3) != null) {
	        	if (userInput.matches("(?i)(salt|throw up|sugar|today|garlic)")){
	            	return true;
	        	}
	        	}
	        	if (foodQuestions.get(4) != null) {
	        	if (userInput.matches("(?i)(cilantro|dragon fruit|dragonfruit|beer|water|vegetables)")){
	            	return true;
	        	}
	        	}
	        	if (foodQuestions.get(5) != null) {
	        	if (userInput.matches("(?i)(spoiled milk|expired milk|antibiotics|too much water|blood)")){
	            	return true;
	        	}
	        	}
	        	if (foodQuestions.get(6) != null) {
	        	if (userInput.matches("(?i)(chicken|turkey|pig|garlic|potato)")){
	            	return true;
	        	}
	        	}
	        	if (foodQuestions.get(7) != null) {
	        	if (userInput.matches("(?i)(egg|meat|salmon|mushroom|beef)")){
	            	return true;
	        	}
	        	}
	        	if (foodQuestions.get(8) != null) {
	        	if (userInput.matches("(?i)(asparagus|meatloaf|pork|cake|cookies)")){
	            	return true;
	        	}
	        	}
	        	if (foodQuestions.get(9) != null) {
	        	if (userInput.matches("(?i)(watermelon|cantaloupe|mango|peach|avacado)")){
	            	return true;
	        	}
	        	}
	            }
	            	return false;
	        }        
	    

		
		}


}
