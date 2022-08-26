package w3d3;

import java.util.*;

public class Activity3 {
	
	 public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter Year: ");
	    int year = sc.nextInt();
	    System.out.print("Enter the Month in Number: ");
	    int month = sc.nextInt();
	    System.out.println(display(year, month));
	  }
	  
	 public static int display(int year, int month) {
	    Calendar cal = Calendar.getInstance();
	    cal.set(Calendar.YEAR, year);
	    cal.set(Calendar.MONTH, month);
	    int DAY_OF_MONTH = cal.getActualMaximum(cal.DAY_OF_MONTH);
	    return DAY_OF_MONTH;
	 }
}

