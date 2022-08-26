package example1;

import java.util.Scanner;
public class EvenOrNOt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Input a number: ");
		   int num = sc.nextInt();
		   
		   if (num %2 == 0 ) {
			   System.out.println(" 1");
			   
		   }
		   else 
			   System.out.println("0");
  
	
	}
}
