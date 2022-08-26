package Day2;

import java.util.Scanner;

class Compute
{
	private int admno;
	private String Sname;
	private int GEnglish;
	private int GMath;
	private int GScience;
	
	public void SetAdmno (int admno)
	{
		this.admno = admno;
	}
	
	public void SetSname (String Sname)
	{
		this.Sname = Sname;
		
	}
	
	public void SetGEnglish (int GEnglish)
	{
		this.GEnglish = GEnglish;
	}
	
	public void SetGMath (int GMath)
	{
		this.GMath = GMath;
	}
	public void SetGScience (int GScience)
	{
		this.GScience = GScience;
	}
	
	
	public int getAdmno() {
		return this.admno;
	}
	
	public String getSname() {
		return this.Sname;
	}
	
	public int getGEnglish() {
		return this.GEnglish;
	}
	
	public int getGMath() {
		return this.GMath;
	}
	
	public int getScience() {
		return this.GScience;
	}
}


public class classStudent {
	public static void main (String[] args) {
		
		 Scanner in = new Scanner(System.in);
	       
	        System.out.println("Enter Admission Number: ");
	        int adno= in.nextInt();      
	       
	    
	        Compute compute = new Compute();
	        compute.SetAdmno(adno);
		
	        
	        System.out.println("Enter Student Name: ");
	        String name= in.next();
	        compute.SetSname(name);
		
	        System.out.println("Enter Grade in English: ");
	        int english= in.nextInt();   
	        compute.SetGEnglish(english);
	        
	        System.out.println("Enter Grade in Math: ");
	        int math= in.nextInt();   
	        compute.SetGMath(math);
	        
	        System.out.println("Enter Grade in Science: ");
	        int science= in.nextInt();   
	        compute.SetGScience(science);
	        
	        
	    float sum = science + math + english;
	    float avg = sum/3;
		System.out.println("Admission No: " + compute.getAdmno());
		System.out.println("Student Name: " + compute.getSname());
		System.out.println("Marks in English is: " + compute.getGEnglish());
		System.out.println("Marks in Math is: " + compute.getGMath());
		System.out.println("Marks in Science is: " + compute.getScience());
		System.out.println("The Final Grade is " + avg);
		
		
		
		
				
	}

}
