package example1;

import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	float num1, num2, num3, sum, ave;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter First Number: ");
		num1 = sc.nextInt();
	System.out.print("Enter Second Number: ");
		num2 = sc.nextInt();
	System.out.print("Enter Third Number: ");
		num3 = sc.nextInt();
		sum = num1 + num2 + num3;
		ave = (int)sum/3;
	System.out.print("The average of three numbers is " + ave);
	
	
	}

}
