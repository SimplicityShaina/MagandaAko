package Day2;

import java.util.Scanner;

public class batsman {
	//default values to the objects
	   int num;
	   String data;
	   int innings;
	   int notout;
	   int runs;
	
	   
	   batsman(int num, String data, int innings, int notout, int runs)
	   {
	      this.num = num;
	      this.data = data;
	      this.innings = innings;
	      this.notout = notout;
	      this.runs = runs;
	     
	   }
	      
	   
	   public static void main(String args[]){
		   
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter Code Number: ");
	      int num = sc.nextInt();
	      
	      System.out.println("Enter a Name: ");
	      String data = sc.next();

	      System.out.println("Enter a Innings: ");
	      int innings = sc.nextInt();     
	      
	      System.out.println("Enter a NotOut: ");
	      int notout = sc.nextInt();      
	      
	      System.out.println("Enter a Runs: ");
	      int runs = sc.nextInt();  
	      
	      float batavg = runs/(innings - notout);
	      
	      batsman obj = new batsman(num, data, innings, notout, runs);// parameterized constructor
	      System.out.println(obj.num);
	      System.out.println(obj.data);
	      System.out.println(obj.innings);
	      System.out.println(obj.notout);
	      System.out.println(obj.runs);
	      System.out.println("The average is " + batavg);

	   }

}

