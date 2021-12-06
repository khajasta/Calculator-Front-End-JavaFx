package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class DiscountController {

	@FXML
	private TextField originalprice;
	
	@FXML
	private TextField discount;
	
	@FXML
	private TextField finalprice;
	
	@FXML
	private TextField savings;
	
	private DiscountCalculator dc=new DiscountCalculator();
	public void calculatediscount(ActionEvent ae)
	{
		String op=originalprice.getText();
		
		String off=discount.getText();
		
		
		int originalamount = Integer.parseInt(op);
		
	    int dis=Integer.parseInt(off);
	    
	    int amount=dc.caldiscount(originalamount, dis);
        
	    int saving=dc.savedamount(originalamount, dis);
	  
        String str1=String.valueOf(amount);
	    
	    finalprice.setText(str1);
	    finalprice.setText(" "+finalprice.getText());
	    
	   
	    String str="You have saved amount:   "+ String.valueOf(saving);
	    
	    savings.setText(str);
	    
	    savings.setText(" "+savings.getText());
		
		
	}
}
