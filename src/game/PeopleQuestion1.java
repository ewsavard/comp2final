package game;
import java.util.ArrayList;
import java.util.List;
public class PeopleQuestion1 extends ArrayList<Question> {
	    // Constructor
	    public PeopleQuestion1(String question, ArrayList<String> answers) {
	        add(new Question(question, answers));
	    }
	    public static PeopleQuestion1 definePeopleQuestions() {
	        PeopleQuestion1 peopleQuestions = new PeopleQuestion1("", new ArrayList<>());
	        peopleQuestions.add(new Question("Does Santa have a ____?", 
					new ArrayList<>(List.of("brother", "dog", "birthday", "phone number", "wife"))));
			peopleQuestions.add(new Question("Who is married to ____?", 
					new ArrayList<>(List.of("Barbara Streisand", "Ben Shapiro", "Nicole Kidman", "Justin Timberlake", "Keith Urban"))));
			peopleQuestions.add(new Question("Why do people____?", 
					new ArrayList<>(List.of("snore", "snore", "cheat", "say bless you", "get hiccups"))));
			peopleQuestions.add(new Question("My mom is my ____", 
					new ArrayList<>(List.of("hero", "life", "rock meaning", "rock", "hero because"))));
			peopleQuestions.add(new Question("Why is my son so ____?", 
					new ArrayList<>(List.of("angry", "angry with me", "mean to me", "clingy", "hyper"))));
			peopleQuestions.add(new Question("Ben ____", 
					new ArrayList<>(List.of("Affleck", "Simmons", "Franklin", "and Jerry's", "Stiller"))));
			peopleQuestions.add(new Question("President ____", 
					new ArrayList<>(List.of("Bush", "Clinton", "Obama", "Trump", "Biden"))));
			peopleQuestions.add(new Question("I'm too ____", 
					new ArrayList<>(List.of("sexy", "sexy for my shirt", "sexy lyrics", "drunk to taste this chicken", "good at goodbyes"))));
			peopleQuestions.add(new Question("Why do women wear ____?", 
					new ArrayList<>(List.of("makeup", "bras", "dresses", "waist beads", "heels"))));
			peopleQuestions.add(new Question("I smell ____", 
					new ArrayList<>(List.of("like beef", "pennies", "burnt toast", "gas in my house","pennies meme"))));
		        return peopleQuestions;
	    }
	}

