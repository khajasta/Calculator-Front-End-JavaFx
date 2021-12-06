package application;

public class BMICalculate {

	protected float calculateBMI(float mass, float height) {
	      return (float) (mass / Math.pow(height / 100.0, 2.0));
	   }
	protected String calculatecategory(float bmi)
	{
		String category=null;
		if(bmi<=16.0)
		{
			category="Underweight";
		}
		else if(bmi>=18.0 && bmi<25.0)
		{
			category="Normal";
		}
		else if(bmi>=25.0)
		{
			category="Overweight";
		}
		return category;
	}
}
