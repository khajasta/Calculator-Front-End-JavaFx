
package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class CurrencyController
{
	@FXML
	private ComboBox cbone;	
	
	@FXML
	private ComboBox cbtwo;
	
    @FXML
	private TextField amount;
    
    @FXML
	private TextField convertedamount;
    
    private Currency c=new Currency();
    
	 
  
    public void initialize(URL location, ResourceBundle resources) {
    	/*cbone.getItems().clear();
    	cbone.getItems().addAll("PKR", "USD");
    	cbone.getSelectionModel().select("PKR");

    //	cbtwo.getItems().clear();
    	cbtwo.getItems().addAll("PKR", "USD");
    	cbtwo.getSelectionModel().select("USD");

  */
    	 ObservableList<String> currencies = FXCollections.observableArrayList("PKR","USD");
  	    
  	    cbone=new ComboBox(currencies);
  	    cbone.setVisibleRowCount(2);
  	    cbone.setValue("PKR");
  	    cbtwo=new ComboBox(currencies);
  	    cbtwo.setVisibleRowCount(2);
  	    cbtwo.setValue("USD");
    }
    
  
    public void changecurrency(ActionEvent ae)
    {
    	
    	String str=(String) cbone.getValue();
    	cbone.setValue(str);
    	String str1=(String) cbtwo.getValue();
    	cbone.setValue(str1);
    	String amountentered=amount.getText();
       
    	float amountinf=Float.parseFloat(amountentered);
    	
    	float changedamount=c.change(amountinf, str1, str);
    	
    	String s=Float.toString(changedamount);
    	
    	convertedamount.setText(" "+s);
    	convertedamount.setText(convertedamount.getText());
    	
    	
    	
    }
}
