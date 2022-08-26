package w3d3;

import java.util.*;
public class Activity2 {
	 public static void main(String[] args)
	    {
	    //Gets a calendar using the default time zone and locale.
	        Calendar calendar = Calendar.getInstance();   
	        System.out.println("The Last day of the current month is: "+calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
	        System.out.println(); 
	    }
}
