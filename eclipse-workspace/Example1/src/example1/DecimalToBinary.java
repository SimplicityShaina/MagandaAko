package example1;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main( String args[] ) {
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Input a number: ");
		 int decimal = sc.nextInt();
		 
		 String bin = Integer.toBinaryString(decimal);
		 System.out.println(bin);
 }
}

