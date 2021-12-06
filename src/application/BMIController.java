package application;

import java.awt.Desktop.Action;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class BMIController {

	
	@FXML
	private TextField heightfield;
	
	@FXML
	private TextField weightfield;
	
	@FXML
	private  TextField labelone;
	
	@FXML
	private TextField labeltwo;
	@FXML
	private  TextField labelthree;
	@FXML
	private  TextField labelfour;

	float finalbmi=0;
	private BMICalculate bmi=new BMICalculate(); 
	public void calculateBMI(ActionEvent ae)
	{
		if(weightfield.getText().trim().isEmpty() ||  weightfield.getText().trim().isEmpty())
			
		{
			Alert noinput=new Alert(AlertType.NONE);
			noinput.setContentText("Please enter height in centimeters and weight in kilograms.Thank you");
			noinput.setAlertType(AlertType.ERROR);
			noinput.show();
		}
		else
		{
			float height=Float.parseFloat(heightfield.getText());
			float weight=Float.parseFloat(weightfield.getText());
			 finalbmi=bmi.calculateBMI(weight, height);
			 String category=bmi.calculatecategory(finalbmi);
			 labelone.setText(" "+finalbmi+" "+category);
			 labeltwo.setText("18.5");
			 labelthree.setText("16.0");
			 labelfour.setText("25.0-40.0");
			 labeltwo.setText(" "+labeltwo.getText());
			 labelthree.setText(" "+labelthree.getText());
			 labelfour.setText(" "+labelfour.getText());
			
		}
	}
	
}
