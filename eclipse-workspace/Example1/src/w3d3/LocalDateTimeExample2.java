package w3d3;
//Program to demonstrate atTime() method of LocalDate class.

import java.time.*;  

public class LocalDateTimeExample2 {
	  public static void main(String[] args) {  
		    LocalDate date = LocalDate.of(2017, 1, 13);  
		    java.time.LocalDateTime datetime = date.atTime(1,50,9);      
		    System.out.println(datetime);   
		  }  

}
