package javaPoint;
import java.io.*;  
public class Sam {
	public static void main(String[] args) {  
        try {  
            Reader reader = new FileReader("C:\\Users\\lizam\\Documents\\Kay Shaina\\Collabera\\file.txt");  
            int data = reader.read();  
            while (data != -1) {  
                System.out.print((char) data);  
                data = reader.read();  
            }  
            reader.close();  
        } catch (Exception ex) {  
            System.out.println(ex.getMessage());  
        }  
    }  
}
