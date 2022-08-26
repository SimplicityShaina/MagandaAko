package javaPoint;
import java.io.*;  

public class DataStream {
	public static void main(String args[])throws Exception{    
	      FileOutputStream fout1=new FileOutputStream("C:\\Users\\lizam\\Documents\\Kay Shaina\\Collabera\\file.txt");    
	      FileOutputStream fout2=new FileOutputStream("C:\\Users\\lizam\\Documents\\Kay Shaina\\Collabera\\testout.txt");    
	        
	      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
	      bout.write(65);    
	      bout.writeTo(fout1);    
	      bout.writeTo(fout2);    
	        
	      bout.flush();    
	      bout.close();//has no effect    
	      System.out.println("Success...");    
	     }    

}
