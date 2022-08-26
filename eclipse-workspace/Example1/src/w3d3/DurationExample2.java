package w3d3;
import java.time.*;
//Java Duration Example: plus()

public class DurationExample2 {
	 public static void main(String[] args) {  
		    Duration d1 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
		    System.out.println(d1.getSeconds());  
		    Duration d2 = d1.plus(d1);  
		    System.out.println(d2.getSeconds());  
		  }  

}
