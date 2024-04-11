package game;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class PeopleQuestion1 extends ArrayList<Question1> {
	
	    private String[] qs;
	    public PeopleQuestion1()  {}
	    
	    public String getQuestion() {
	    	String[] myList = {"Does Santa have a...?", "Who is married to...?", "Why do people...?", "My mom is my...?", "Why is my son so...?", "Ben...", "President...", "I'm too...", "Why do women wear...?", "I smell..."};
	    	this.qs = myList; 
	    	Random r = new Random();
	    	int i = r.nextInt(0, myList.length);
	    	return myList[i];
	    }
	    
	    public String[] getAnswers(String s) {
	    	String[] err = {"Error"};
	    	String[] ans1 = {"brother", "dog", "birthday", "phone number", "wife"};
	    	String[] ans2 = {"Barbara Streisand", "Ben Shapiro", "Nicole Kidman", "Justin Timberlake", "Keith Urban"};
	    	String[] ans3 = {"snore", "snore", "cheat", "say bless you", "get hiccups"}; 
	    	String[] ans4 = {"hero", "life", "rock meaning", "rock", "hero because"};
	    	String[] ans5 = {"angry", "angry with me", "mean to me", "clingy", "hyper"};
	    	String[] ans6 = {"Affleck", "Simmons", "Franklin", "and Jerry's", "Stiller"};
	    	String[] ans7 = {"Bush", "Clinton", "Obama", "Trump", "Biden"};
	    	String[] ans8 = {"sexy", "sexy for my shirt", "sexy lyrics", "drunk to taste this chicken", "good at goodbyes"};
	    	String[] ans9 = {"makeup", "bras", "dresses", "waist beads", "heels"};
	    	String[] ans10 = {"like beef", "pennies", "burnt toast", "gas in my house","pennies meme"};
	    	if (s.equals(qs[0])) {
	    		return ans1; 
	    	}
	    	else if (s.equals(qs[1])) {
	    		return ans2; 
	    	}
	    	else if (s.equals(qs[2])) {
	    		return ans3; 
	    	}
	    	else if (s.equals(qs[3])) {
	    		return ans4;
	    	}
	    	else if (s.equals(qs[4])) {
	    		return ans5; 
	    	}
	    	else if (s.equals(qs[5])) {
	    		return ans6;
	    	}
	    	else if (s.equals(qs[6])) {
	    		return ans7; 
	    	}
	    	else if (s.equals(qs[7])) {
	    		return ans8; 
	    	}
	    	else if (s.equals(qs[8])) {
	    		return ans9; 
	    	}
	    	else if (s.equals(qs[9])) {
	    		return ans10;
	    	}
	    	return err; 
	    }
	}

