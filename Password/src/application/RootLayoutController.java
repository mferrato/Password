package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;



public class RootLayoutController {
	
	@FXML
	private PasswordField Password;
	@FXML
	private Button OK;
	@FXML
	private Button Help;
	@FXML
	private Label message;
	
	
	@FXML
	public void okEvent(){
		System.out.println(Password.getText());
		if(Password.getText().equals("bugaboo")){
		
			message.setText("The password is correct");
		}
		else{
			message.setText("The password is incorrect");
		}
	}
	
		@FXML
		public void helpEvent(){
			message.setText("Help was clicked");
		}
}
