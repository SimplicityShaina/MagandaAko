package javaPoint;
import java.io.FileOutputStream;  
import java.io.PrintStream;  

public class FileWriteinDoc {
	
	public static void main(String args[])throws Exception{    
	   FileOutputStream fout=new FileOutputStream("C:\\Users\\lizam\\Documents\\example1.rtf");    
	   PrintStream pout=new PrintStream(fout);      
	   pout.println("Good Morning");    
	   pout.close();    
	   fout.close();    
	  System.out.println("Success?");    
	 }    
}
