package javaPoint;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Counter {
	
	 private static final String FILE_PATH = "C:\\Users\\lizam\\Documents\\Kay Shaina\\4th Year S.Y. 2021-2022\\2nd Semester\\CPE Elective 3\\E4K_FINALHW1_MAULION.docx";
	   public static void main(String args[]) throws IOException {
	      FileUtil fileUtil = new FileUtil(FILE_PATH);
	      System.out.println("No. of characters in file: " + fileUtil.getCharCount());
	   }
}

	class FileUtil {
	   static BufferedReader reader = null;    
	   public FileUtil(String filePath) throws FileNotFoundException {
	      File file = new File(filePath);
	      FileInputStream fileStream = new FileInputStream(file);
	      InputStreamReader input = new InputStreamReader(fileStream);
	      reader = new BufferedReader(input);
	   }

	   public static int getCharCount() throws IOException {
	      int charCount = 0;
	      String data;        
	      while((data = reader.readLine()) != null) {
	         charCount += data.length();                        
	      }            
	      return charCount;
	   }
	}

