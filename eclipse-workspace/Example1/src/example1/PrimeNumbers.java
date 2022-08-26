package example1;
import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			 System.out.print("Input a number: ");
			   int num = sc.nextInt();
			   	
			   boolean flag = true;
			   for (int i = 2; i <= num / 2; ++i) {
				   if (num % i == 0) 
				   {
					   flag = false;
					   break;
				   }
			   }
    if (flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
	}
}

