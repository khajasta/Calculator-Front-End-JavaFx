package application;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
public class MainController {

	@FXML
	private Label finalnum;
	private long firstnum=0;
	private String operator="";
	private boolean flag=true;
	private Model model=new Model();
	private Stage stage;
	private Scene scene;
	private Parent root;
	@FXML
	public void processnumbers(ActionEvent event)
	{
	       if(flag) {
	    	   finalnum.setText("");
	    	   flag=false;
	       }
	       String value=((Button)event.getSource()).getText();
	       finalnum.setText(finalnum.getText()+value);
	}

	@FXML
	public void processoperators(ActionEvent event)
	{
		String value=((Button)event.getSource()).getText();
		if(!value.equals("="))
		{
			if(!operator.isEmpty())
				return;
			operator=value;
			firstnum=Long.parseLong(finalnum.getText());
			finalnum.setText("");
		}
		else
		{
			if(operator.isEmpty())
				return;
			long number2=Long.parseLong(finalnum.getText());
			float output=model.Calculator(firstnum, number2, operator);
			finalnum.setText(String.valueOf(output));
			operator="";
			flag=true;
		}
	}
	@FXML
	public void SwitchtoCalculator(ActionEvent ae) throws IOException
	{
		 root = FXMLLoader.load(getClass().getResource("application/Mean.fxml"));
		stage=(Stage)((Node)ae.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	@FXML
	public void SwitchtoBMI(ActionEvent ae) throws IOException
	{
		 root = FXMLLoader.load(getClass().getResource("BMI Calculator.fxml"));
		stage=(Stage)((Node)ae.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	@FXML
	public void SwitchtoCurrency(ActionEvent ae) throws IOException
	{
		 root = FXMLLoader.load(getClass().getResource("Currency.fxml"));
		stage=(Stage)((Node)ae.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	@FXML
	public void SwitchtoDiscount(ActionEvent ae) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("Discount.fxml"));
		stage=(Stage)((Node)ae.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	@FXML
	public void SwitchtoAge(ActionEvent ae) throws IOException
	{
		 root = FXMLLoader.load(getClass().getResource("Age.fxml"));
		stage=(Stage)((Node)ae.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	@FXML
	public void SwitchtoInvestment(ActionEvent ae) throws IOException
	{
		 root = FXMLLoader.load(getClass().getResource("Investement.fxml"));
		stage=(Stage)((Node)ae.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
}
