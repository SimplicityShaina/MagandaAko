package w3d3;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.util.Scanner;

public class Activity7CreditCard {
	
	   public static void main(String args[]) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the year: ");
		   int year = sc.nextInt();
		   
		   System.out.println("Enter the month: ");
		   int month = sc.nextInt();
		   
		   System.out.println("Enter the day: ");
		   int day = sc.nextInt();
		   
		   //Getting the current date value
		   LocalDate givenDate = LocalDate.of(year, month, day);
		   System.out.println("Date: "+givenDate);
		   YearMonth creditCardExpiry = YearMonth.of(2023, Month.FEBRUARY);
		   System.out.printf("Your credit card expires on %s: No of days: %s \n",
		      creditCardExpiry, creditCardExpiry.lengthOfMonth());
		   }
		   
}
