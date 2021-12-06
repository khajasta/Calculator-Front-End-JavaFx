package application;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class Agecontroller {
	
	@FXML
	private DatePicker dp;
	
	@FXML
	private TextField fieldtwo;
	
	@FXML
	private TextField fieldthree;
	
	@FXML
	private TextField fieldfour;
	
	@FXML
	private TextField fieldfive;
	@FXML
	private TextField fieldsix;
	
	private Calculateage age=new Calculateage(); 
	
	public void calculatingage(ActionEvent ae ) 
	{
		
		LocalDate today=dp.getValue();	
        int day=today.getDayOfMonth();
        int month=today.getMonthValue();
        int year=today.getYear();
			
       
        
        int years=age.agecalculator(year, month, day);
        int months=age.monthcalculator(year, month, day);
        int days=age.dayscalculator(year, month, day);
        
        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strDate = dateFormat.format(date);  
        
			fieldtwo.setText(strDate);
			fieldtwo.setText(fieldtwo.getText());
			String str=String.valueOf(years);
			fieldthree.setText(str);
			fieldthree.setText(fieldthree.getText());
			fieldfour.setText(str);
			fieldfour.setText(fieldfour.getText());
			String str1=String.valueOf(months);
			fieldfive.setText(str1);
			fieldfive.setText(fieldfive.getText());
			String str2=String.valueOf(days);
			fieldsix.setText(str2);
			fieldsix.setText(fieldsix.getText());
			
}
}