package net.penguincoders;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.fxml.Initializable;

public class SentimentUIController implements Initializable
{
	@FXML
	public TextArea inputText;
	@FXML
	public Button calculateScore;
	@FXML
	public Label scoreLabel;
	@FXML
	public URL location;
	@FXML
	public ResourceBundle resources;

	// Add a public no-args constructor
	public SentimentUIController() {
	}
	@FXML
	public void printLabelOutput() 
	{
		NLP.init();
		String input = inputText.getText();
		String score = Integer.toString(NLP.findSentiment(input));
		scoreLabel.setText("Sentiment Score: "+score);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}