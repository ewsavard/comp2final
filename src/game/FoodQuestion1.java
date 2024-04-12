package game;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class FoodQuestion1 extends ArrayList<Question1>{
	
	public ArrayList questions;
	
			public FoodQuestion1() {}

		    
		    public String getQuestion() {
		    	String[] myList = {"Chocolate...", "Spicy...", "Why do chefs...?", "I ate too much...", "Taste of...", "What happens if I drink...?", "How to roast a...?", "Is it safe to eat raw...?", "Best recipe for...", "How to choose a ripe..."};  
		    	Random r = new Random(); 
		    	int i = r.nextInt(0, myList.length);
		    	return myList[i];		    	
		    }
		    public String[] getAnswers(String s) {
		    	String[] ans1 = {"chip cookies", "chip cookies recipe", "cake", "ice cream near me", "milk"};
		    	String[] ans2 = {"food", "mayo", "ramen", "noodles", "chicken"};
		    	String[] ans3 = {"wear hats", "say all day", "use shallots instead of onions", "have tattoos", "like cooking"};
		    	String[] ans4 = {"salt", "and I need to throw up", "sugar", "today", "garlic"};
		    	String[] ans5 = {"cilantro", "dragon fruit", "beef", "water", "vegetables"};
		    	String[] ans6 = {"spoiled milk", "antibiotics", "blood", "expired milk", "too much water"};
		    	String[] ans7 = {"chicken", "turkey", "pig", "potato", "head of garlic"};
		    	String[] ans8 = {"egg", "meat", "mushrooms", "salmon", "beef"};
		    	String[] ans9 = {"asparagus", "meatloaf", "pork chops", "birthday cake", "cookies"};
		    	String[] ans10 = {"watermelon", "cantaloupe", "mango", "peach", "avocado"};
		    	String[] error = {"error"};
		    	
		    	if (s.equals("Chocolate...")) {
		    		return ans1;
		    	}
		    	else if(s.equals("Spicy...")) {
		    		return ans2; 
		    	}
		    	else if(s.equals("Why do chefs...?")) {
		    		return ans3; 
		    	}
		    	else if(s.equals("I ate too much...")) {
		    		return ans4; 
		    	}
		    	else if(s.equals("Taste of...")) {
		    		return ans5; 
		    	}
		    	else if(s.equals("What happens if I drink...?")) {
		    		return ans6; 
		    	}
		    	else if(s.equals("How to roast a...?")) {
		    		return ans7; 
		    	}
		    	else if(s.equals("Is it safe to eat raw...")) {
		    		return ans8; 
		    	}
		    	else if(s.equals("Best recipe for...")) {
		    		return ans9; 
		    	}
		    	else if(s.equals("How to choose a ripe...")){
		    		return ans10;
		    	}
		    	return error;
		    }    
	}
