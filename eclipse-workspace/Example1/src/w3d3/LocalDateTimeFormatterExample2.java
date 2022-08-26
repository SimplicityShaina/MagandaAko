package w3d3;
//Java LocalDateTime Example: now()
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  

public class LocalDateTimeFormatterExample2 {
	 public static void main(String[] args) {  
		    LocalDateTime datetime1 = LocalDateTime.now();  
		    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
		    String formatDateTime = datetime1.format(format);   
		    System.out.println(formatDateTime);    
		  }  

}
