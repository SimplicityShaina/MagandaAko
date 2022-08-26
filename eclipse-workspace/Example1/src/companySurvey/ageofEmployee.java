package companySurvey;

import java.util.*;

import java.text.DecimalFormat;
import java.util.Scanner;


public class ageofEmployee {
		
		
		public double averageAgeCalculator (int[] age)
	    {
	        int len=age.length;
	        double sum=0.0;
	        for(int i=0;i<len;i++)
	        {
	            sum+=age[i];
	        }
	        double avg=sum/len;
	        return avg;
	    }
	    
	    public static void main (String[] args) {
		
	    Scanner sc =new Scanner(System.in);
	    ageofEmployee obj=new ageofEmployee();
	    System.out.println("Enter total no.of employees:");
	    int n =sc.nextInt();
	    int flag=0;
	    
	    try {
	        if(n>1)
	        { 
	        	int[] age=new int[n];
	            System.out.println("Enter the age for "+n+" employees:");
	            
	            for(int i=0;i<n;i++)
	            	{
	                	int a=sc.nextInt();
	                	
	                	if(a>=16 && a<=60)
	                		{
	                			age[i]=a;
	                		}
	                	else
	                		{
	                			System.out.println("Invalid age encountered!");
	                			flag++;
	                			break;
	                		}
	            	}
	        
	        if(flag==0)
	            {   
	        		DecimalFormat df=new DecimalFormat("####.00");
	                System.out.println("The average age is "+df.format(obj.averageAgeCalculator(age)));
	               // System.out.println(age[age.length -1]);
	            }
	        }
	       
	        else
	        	{
	        	
	            System.out.println("Please enter a valid employee count"  );
	        	}
	   
	        
	    } 
		
		catch (Exception e) 
			{
				String b = sc.next();
	    		System.out.println("java.lang.NumberFormatException: For input string: "+ b );
	    	
			
			}
	    }
	    
}


    

