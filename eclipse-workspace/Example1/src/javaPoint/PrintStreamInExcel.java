package javaPoint;
import java.io.FileOutputStream;  
import java.io.PrintStream;  
public class PrintStreamInExcel {
	
	
	 public static void main(String args[])throws Exception{  
		 int age=12;
	   FileOutputStream fout=new FileOutputStream("C:\\Users\\lizam\\Documents\\Kay Shaina\\Collabera\\Age.xlsx");    
	   PrintStream pout=new PrintStream(fout);      
	   pout.println("Age is equal to "+ age);    
	   pout.close();    
	   fout.close();    
	  System.out.println("Success?");  
	 }
}
