package example1;
import java.util.Scanner;

public class SumOfTwoIntegers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.print("Enter first integer: ");
	      	int num1 = sc.nextInt();
	      System.out.print("Enter second integer: ");
	      	int num2 = sc.nextInt();
	      	int sum = num1 + num2;
	      System.out.print("The sum of the two number is: "+ sum);
	}

}

