package w3d3;

import java.time.LocalDate;
import java.util.Scanner;

public class Activity4 {
	
	 public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the year: ");
	      int year = sc.nextInt();
	      
	      System.out.println("Enter the month in number: ");
	      int month = sc.nextInt();
	      
	      System.out.println("Enter the day: ");
	      int day = sc.nextInt();
	      
	      //Getting the current date value
	      LocalDate givenDate = LocalDate.of(year, month, day);
	      System.out.println("Date: "+givenDate);
	      //Retrieving the current date
	      LocalDate currentDate = LocalDate.now();
	      //Comparing both values
	      boolean same = givenDate.equals(currentDate);
	      
	      if(same) 
		      {
		         System.out.println("Given date is equal to the current date ");
		      }
	      else 
		      {
		         System.out.println("Given date is not equal to the current date ");
		      }
	   }
}
