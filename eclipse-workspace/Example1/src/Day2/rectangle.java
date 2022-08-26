package Day2;
import java.util.Scanner;
public class rectangle {
	
	
}
class areaofRectangle extends shape {
	public static void main(String args[]) 
    {   
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the length for rectangle: ");
      int length= s.nextInt();      
      System.out.println("Enter the width for rectangle: ");
      int width= s.nextInt();   
      areaofRectangle  a =new areaofRectangle();
      a.areaofRectangle(length, width);
      System.out.println("Area of Rectangle is: " + a.area);  
      
  	  
    } 
    
}
