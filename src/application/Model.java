package application;

public class Model {

	public float Calculator(long number1,long number2, String opt)
	{
		switch(opt) {
		case"+":
			return number1+number2;
		case"-":
			return number1-number2;
		case"*":
			return number1*number2;
		case"/":
			if(number2==0)
				return 0;
			return number1/number2;
          default:
        	  return 0;
		}
	
		}
}
