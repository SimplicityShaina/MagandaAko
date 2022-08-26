package example1;

import java.util.Scanner;
public class CelciustoFahrenheit {
	public static void main(String[] args) {
		double num, x;
		Scanner sc = new Scanner(System.in);
		 System.out.print("Input Celcuis: ");
	      num = sc.nextInt();
	      
	      x = (num *1.8) + 32;
	      System.out.print("The Fahrenheit is: " + x);
	}
}
