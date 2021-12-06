package application;

public class InvCalculator {
	
	public float invcal(int ipb, int r,int t) {
		
		float A=0;
		
		int bracket=1+ (r/4);
		int power1=4*t;
		float power=(float) Math.pow(bracket,power1);
		A=(float)ipb*power;
		return A;
		
	}

}
