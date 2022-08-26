package example1;
import java.util.*; 

public class SwapTwoVariables {
	public static void main(String a[])   
    {   
		Scanner sc = new Scanner(System.in);  
        System.out.println("Enter a value of x: ");  
        	int x = sc.nextInt();  
        System.out.println("Enter a value of y: ");
        	int y = sc.nextInt(); 
        
       

        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("Swapping the two variables, the x is now "+ x +" and the y is now " + y);   
    }   
}
