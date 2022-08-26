package w3d3;
import java.time.*;  
import java.time.temporal.Temporal;  

public class ZoneOffSetExample1 {
	public static void main(String[] args) {  
	    ZoneOffset zone = ZoneOffset.UTC;  
	    Temporal temp = zone.adjustInto(ZonedDateTime.now());  
	    System.out.println(temp);  

	}
}
