package application;

public class Currency
{

	public float change(float amount,String from,String to)
	{
		
		float convertedamount=0;
		if ((from.compareTo("PKR")==0))
		{
			convertedamount=(float) (amount*0.0057);
		}
		else if((from.compareTo("USD")==0))
		{
			convertedamount=(float) (amount*176.20);
		}
		return convertedamount;
	}
}