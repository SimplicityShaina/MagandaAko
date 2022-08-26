package javaPoint;
import java.io.FileOutputStream;  
import java.io.PrintStream;  

public class PrintStreamTest {
	public static void main(String args[])throws Exception{    
		   FileOutputStream fout=new FileOutputStream("C:\\Users\\lizam\\Documents\\Kay Shaina\\Collabera\\testout.txt");    
		   PrintStream pout=new PrintStream(fout);    
		   pout.println(2016);    
		   pout.println("Hello Java");    
		   pout.println("Welcome to Java");    
		   pout.close();    
		   fout.close();    
		  System.out.println("Success?");    
		 }    

}
