package javaPoint;
import java.io.FileWriter;  

public class JavaPoint {
	public static void main(String args[]){    
        try{    
          FileWriter fw=new FileWriter("C:\\Users\\lizam\\Documents\\Kay Shaina\\Collabera\\testout.txt");    
          fw.write("Welcome to javaTpoint.");    
          fw.close();    
         }catch(Exception e){System.out.println(e);}    
         System.out.println("Success...");    
    }    
}  

