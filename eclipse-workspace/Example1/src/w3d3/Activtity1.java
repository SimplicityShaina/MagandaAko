package w3d3;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Activtity1 {
	
	   public static void main(String[] args) {
	        //Change this to your desired Start Date
		LocalDate dateBefore = LocalDate.of(2021, Month.APRIL, 10);
	        //Change this to your desired End Date
		LocalDate dateAfter = LocalDate.of(2021, Month.APRIL, 15);
		
		long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
		System.out.println("Number of Days are: " + noOfDaysBetween);
		long noOfMonthsBetween = ChronoUnit.MONTHS.between(dateBefore, dateAfter);
		System.out.println("Number of Months are: " + noOfMonthsBetween);
	   }    
}
