package w3d3;
//Java Clock class Example: instant()

import java.time.Clock;  

public class InstantClock {
	  public static void main(String[] args) {  
		    Clock c = Clock.systemUTC();  
		    System.out.println(c.instant());  
		  }  

}
