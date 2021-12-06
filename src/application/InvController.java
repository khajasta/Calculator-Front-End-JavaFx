package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class InvController {


	@FXML
	private TextField amount;
	
	@FXML
	private TextField interest;
	
	@FXML
	private  TextField finalamount;
	
	@FXML
	private  TextField noofyears;
	
    private InvCalculator ic=new InvCalculator();
    
    public void calculateinv(ActionEvent ae)
    {

    	String str=amount.getText();
    	
    	int ipb=Integer.parseInt(str);
    	
    	String str1=interest.getText();
    	
    	int r=Integer.parseInt(str1);
    	
       String str2=noofyears.getText();
    	
    	int noy=Integer.parseInt(str2);
    	
    	float investement=ic.invcal(ipb,r,noy);
    	
    	String fa=String.valueOf(investement);
    	 finalamount.setText(" "+fa);
    	 finalamount.setText(finalamount.getText());
    }
	
	
	
}
