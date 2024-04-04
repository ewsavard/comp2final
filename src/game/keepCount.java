package game;

public class keepCount {

	public int score; 
	public int guesses; 
	public int round; 
	public int highScore; 
	private int count = 0; 
	
	
	public void getScore(int x) {
		this.score = x; 
		count++;
	}
	public void getGuesses(int x) {
		this.guesses = x;
	}
	public void getRound(int x) {
		this.round = x;
	}
	public void getHighscore() {
		this.highScore += score; 
	}

}
