package w3d3;
import java.time.*;  

public class DurationExample1 {
	 public static void main(String[] args) {  
		    Duration d1 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
		    System.out.println(d1.getSeconds());  
		    Duration d2 = d1.minus(d1);  
		    System.out.println(d2.getSeconds());  
		  }  

}
