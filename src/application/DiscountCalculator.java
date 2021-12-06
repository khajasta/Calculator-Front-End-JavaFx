package application;



public class DiscountCalculator {
	
	public int caldiscount(int original,int discount)
	{
		int total=100-discount;
		
		int amount= (total*original)/100;
		
		
		return amount;  //finalprice
	}

	public int savedamount(int original,int discount)
	{
		
        int total=100-discount;
		
		int amount= (total*original)/100;
		
		
		int saved=(original-amount);
		
		return saved;
		
	}
	
}
