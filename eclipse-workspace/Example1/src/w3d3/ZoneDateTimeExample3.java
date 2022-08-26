package w3d3;
//Java ZonedDateTime class Example: plus()
import java.time.*;  

public class ZoneDateTimeExample3 {
	public static void main(String[] args) {  
	    ZonedDateTime zone= ZonedDateTime.now();  
	    ZonedDateTime p = zone.plus(Period.ofDays(126));  
	    System.out.println(p);  
	  }   

}
