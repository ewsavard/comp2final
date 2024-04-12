package game;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
public class Score1 implements ScoreCounter1{

	    private int score;
	    private int tries;


	    public Score1(int maxTries) {
	        this.score = 0;
	        this.tries = maxTries;
	    }

	@Override
	    public void increaseScore() {
	        this.score++;
	    }

	@Override
	    public void decreaseTries() {
	        this.tries --;
	    }

	@Override
	    public int getScore() {
	        return this.score;
	    }

	@Override
	    public int getTriesLeft() {
	        return this.tries;
	    }

	@Override
	    public boolean hasTriesLeft() {
	        if (this.tries > 0) {
	        	return true;
	        }
	    	return false;
	    }

	public Text displayIncorrectGuess() {
	        Text incorrectSymbol = new Text("X");
	        incorrectSymbol.setFill(Color.RED);
	        incorrectSymbol.setFont(Font.font("Arial", 64));
	        return incorrectSymbol;
	    }
	}

