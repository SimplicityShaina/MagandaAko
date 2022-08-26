package Day2;
import java.util.Scanner;
public class square {
double area;
//double s;
	
	
}
class areaofSquare extends shape {
	public static void main(String args[]) 
    {   
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the side for square: ");
      double squares= s.nextDouble();      
      areaofSquare  a =new areaofSquare();
      a.areaofSquare(squares);
      System.out.println("Area of Square is: " + a.area);  
      
  	  
    } 
    

    
}


