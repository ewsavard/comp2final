package game;
//
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class culturefxmlController extends Application implements Initializable{
	@FXML
	private Text question; 
	@FXML
	private Rectangle r1, r2 ,r3, r4, r5;
	@FXML 
	private Button guess, GiveUp; 
	@FXML 
	private Text ans1, ans2, ans3, ans4, ans5;
	@FXML
	private TextField user; 
	@FXML 
	private Text wrong; 
	
	public int a1 = 10000;
	public int a2 = 8000;
	public int a3 = 6000; 
	public int a4 = 4000;
	public int a5 = 2000; 
	private String userGuess;
	private String[] answ;
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		CultureQuestion1 x = new CultureQuestion1(); 
		String q = x.getQuestion();
		this.question.setText(q);
		answ = x.getAnswers(q);
		this.ans1.setText(answ[0]);
		this.ans2.setText(answ[1]);
		this.ans3.setText(answ[2]);
		this.ans4.setText(answ[3]);
		this.ans5.setText(answ[4]);
		
		
	}
	
	@FXML 
	public void showAnswer(ActionEvent x) {
		Score1 p = new Score1(3);
		
		userGuess = user.getText();
		if (userGuess.equals(answ[0])) {
			r1.setVisible(false);
			p.increaseScore();
		}
		else if (userGuess.equals(answ[1])) {
			r2.setVisible(false);	
			p.increaseScore();
		}
		else if (userGuess.equals(answ[2])) {
			r3.setVisible(false);
			p.increaseScore();
		}
		else if (userGuess.equals(answ[4])) {
			r4.setVisible(false);
			p.increaseScore();
		}
		else if (userGuess.equals(answ[5])) {
			r5.setVisible(false);
			p.increaseScore();
		}
//		else {
//			this.wrong = p.displayIncorrectGuess();
//		}
		p.decreaseTries(); 
	}
	@FXML 
	public void giveUp (ActionEvent t) {
		
	}
	
	

	@Override
	public void start(Stage arg0) throws Exception {
		
		
	}
	public static void main (String[] args) {
		launch(args);
	}


}
