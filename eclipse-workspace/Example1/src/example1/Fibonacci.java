package example1;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter a number: ");
     
    		int num = sc.nextInt();
    		int firstNum = 0;
    		int secondNum = 1;
    		int thirdNum = 0;
     
    while (thirdNum < num)
    	{
        	thirdNum = firstNum + secondNum;
         
        	firstNum = secondNum;
         
        	secondNum = thirdNum;
    	}
     
    if(thirdNum == num)
    	{
        	System.out.println("The number is Fibonacci");
    	}
    else
    	{
        	System.out.println("The number is not Fibonacci");
    	}
    }   
}
