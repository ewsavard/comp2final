package game;
import java.util.ArrayList;
import java.util.Scanner;
	public class AnswerChecker1 {
			public static void main(String[] args)  {
			      ArrayList<Question> cultureQuestions = CultureQuestion1.defineCultureQuestions();
			      ArrayList<Question> peopleQuestions = PeopleQuestion1.definePeopleQuestions();
			      ArrayList<Question> animalQuestions = AnimalQuestion1.defineAnimalQuestions();
			      ArrayList<Question> foodQuestions = FoodQuestion1.defineFoodQuestions();
			      
			      ArrayList<ArrayList<Question>> allQuestions = new ArrayList<>();
			      allQuestions.add((cultureQuestions));
			      allQuestions.add((peopleQuestions));
			      allQuestions.add((animalQuestions));
			      allQuestions.add((foodQuestions));
			      
			      ScoreCounter score = new Score(3);
			      Scanner scanner = new Scanner(System.in);
			      
			          // Prompt the user to choose a category
			      System.out.println("Which category of question do you want to answer?");
			      System.out.println("1. Culture");
			      System.out.println("2. People");
			      System.out.println("3. Animal");
			      System.out.println("4. Food");
			      System.out.print("Enter the number of the category: ");
			        int categoryIndex = scanner.nextInt();
			            scanner.nextLine(); 

			        if (categoryIndex < 1 || categoryIndex > allQuestions.size()) {
			                System.out.println("Invalid category number.");
			                return;
			            }
			            
			        ArrayList<Question> selectedCategory = allQuestions.get(categoryIndex - 1);
			        // Print the questions in selected category
			        for (int i = 1; i < selectedCategory.size(); i++) {
			                System.out.println((i) + ". " + selectedCategory.get(i).getQuestion());
			            }
			        // Which question does user want to answer?
			        System.out.print("Enter the number of the question you want to answer: ");
		            int questionIndex = scanner.nextInt();
		            scanner.nextLine(); 
		           
		            if (questionIndex < 1 || questionIndex > selectedCategory.size()) {
		                System.out.println("Invalid question number.");
		                return;
		            }
		            Question selectedQuestion = selectedCategory.get(questionIndex);
		             System.out.println("Question: " + selectedQuestion.getQuestion());
		            while (score.hasTriesLeft() && score.getScore()< 5) {
		            // Get selected question and user input
		           
		        
		            System.out.print("Enter your answer: ");
		            String userInput = scanner.nextLine();
		            if (selectedQuestion.cultureInputIsCorrect(cultureQuestions, userInput)
		            		||selectedQuestion.peopleInputIsCorrect(peopleQuestions, userInput)
		            		|| selectedQuestion.animalInputIsCorrect(animalQuestions, userInput)
		            		|| selectedQuestion.foodInputIsCorrect(foodQuestions, userInput)) {
					            System.out.println("Your answer is correct!");
					            score.increaseScore(); 
					            System.out.println("Score: " + score.getScore());
					        } else {
					            System.out.println("Incorrect answer.");
					           // System.out.print(score.displayIncorrectGuess());
					            score.decreaseTries();
					            System.out.println("Tries left: " + score.getTriesLeft());
					        }
					    }
		            if (score.getScore() == 5) {
		            	scanner.close();
		                 System.out.println("Congratulations! You have guessed all possible answers correctly for this question.");
		                 System.out.println(selectedQuestion.getAnswers());
		             }else {
		            scanner.close();
		            System.out.println("Game over!");
		             } 
			        }
	}
