package example1;

import java.util.Scanner;

public class AcceptInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Input a number: ");
		   int num = sc.nextInt();
		   

		   System.out.printf("%d + %d%d + %d%d%d\n", num, num, num, num, num, num  );
		   int x = num *11;
		   int y = num*111;
		   int sum = num + x + y;
		   System.out.print("The sum is "+ sum + " " + y);
		   
	}
}
