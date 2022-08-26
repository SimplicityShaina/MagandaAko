package w3d3;

import java.time.LocalDate;
import java.util.Scanner;

public class Activity6BeforeOrAfter {
	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year: ");
    int year = sc.nextInt();
    
    System.out.println("Enter the month: ");
    int month = sc.nextInt();
    
    System.out.println("Enter the day: ");
    int day = sc.nextInt();
    
    //Getting the given date value
    LocalDate givenDate = LocalDate.of(year, month, day);
    //Getting the current date
    LocalDate currentDate = LocalDate.now();
    if(currentDate.isAfter(givenDate)) {
       System.out.println("The given date succeeds the current date");
    }else if(currentDate.isBefore(givenDate)) {
       System.out.println("The given date preceds the current date");
    }else if(currentDate.isEqual(givenDate)) {
       System.out.println("Current date is equal to the given date ");
    }
 }
}
