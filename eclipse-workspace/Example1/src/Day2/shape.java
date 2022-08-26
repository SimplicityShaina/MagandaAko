package Day2;
import java.util.Scanner;
public class shape {
	double area;
	
	
	
	public void circle (double r)
	{
		 area = (22 * r * r) / 7;
	}
	
	public void areaofSquare (double s)
	{
		 area = (s * s);
	}
	
	public void areaofRectangle (int L, int w)
	{
		 area = (L * w);
	}
	
	
}
class circle extends shape {
	public static void main(String args[]) 
    {   
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the radius: ");
      double rad= s.nextDouble();      
      circle  a=new circle();
      a.circle(rad);
      System.out.println("Area of Circle is: " + a.area);  
      
  	  
    } 
    

    
}

