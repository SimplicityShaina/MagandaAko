package w3d3;
import java.time.*;  

public class ZonedDateTimeExample2 {
	public static void main(String[] args) {  
	    java.time.LocalDateTime  ldts = LocalDateTime.of(2017, Month.JANUARY,  19,   15,   26);  
	    ZoneId  ph = ZoneId.of("Asia/Manila");   
	    ZonedDateTime zone1  = ZonedDateTime.of(ldts, ph);   
	    System.out.println("In Philippines Time Zone: " + zone1);  
	    ZoneId  tokyo = ZoneId.of("Asia/Tokyo");   
	    ZonedDateTime zone2   = zone1.withZoneSameInstant(tokyo);   
	    System.out.println("In Tokyo Central Time Zone:"  + zone2);  
	  }

}
