package application;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.WeekFields;
public class Calculateage {

	public int agecalculator(int years,int months,int days) {
     LocalDate today=LocalDate.now();	
     LocalDate birthdate=LocalDate.of(years,months,days);
	 int age=Period.between(birthdate,today).getYears();
	 return age;
	}
	public int monthcalculator(int years,int months,int days) {
	     LocalDate today=LocalDate.now();	
	     LocalDate birthdate=LocalDate.of(years,months,days);
		 int age=Period.between(birthdate,today).getYears();
		 int monthage=Period.between(birthdate,today).getMonths();
		 int total=(monthage+age)*12;
		 return total;
		}
	public int dayscalculator(int years,int months,int days) {

		LocalDate dateBefore = LocalDate.of(years, months, days);
		LocalDate today=LocalDate.now();	
	long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, today);
		 int weeks=(int) (noOfDaysBetween/7);
		 return weeks;
		}
}
