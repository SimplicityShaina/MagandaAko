package artMySqlFroup;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ExecuteMultipleSQL {
	 //  static final String DB_URL = "jdbc:mysql://localhost/mutipleexample";
	 //  static final String USER = "root";
	//   static final String PASS = "root";
	  // static final String data = "SELECT * FROM SalaryofEmployee WHERE salary>=20000";
		   
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try{  
				//Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/multipleexample","root","root");  
				 
				Statement st=con.createStatement();  
				
				
		    	//String data = "CREATE TABLE STUDENT(STUDENTID VARCHAR(10) PRIMARY KEY,NAME VARCHAR(20),DEPARTMENT VARCHAR(10))";
		    	
		    	String sql2
                = "INSERT INTO STUDENTS VALUES('S107','KIM','MedTech')";
		    	String sql3
                = "INSERT INTO STUDENTS VALUES('S108','RAQUEL','IT')";
		    	String sql4
                = "INSERT INTO STUDENTS VALUES('S109','MATTHEW','CE')";
		    	String sql5
                = "INSERT INTO STUDENTS VALUES('S110','PRINCESS','IE')";
		    	String sql6
                = "INSERT INTO STUDENTS VALUES('S111','SHAINA','CPE')";
		    	//  st.addBatch(data);
		          st.addBatch(sql2);
		          st.addBatch(sql3);
		          st.addBatch(sql4);
		          st.addBatch(sql5);
		          st.addBatch(sql6);
		    	  
		    	
		    	
		    	st.executeBatch();
		    	ResultSet rs=st.executeQuery("SELECT * FROM Students"); 
		    	
		    	 // Print commands
	            System.out.println(
	                "StudentID\tName\t\tDepartment");
	            System.out.println(
	                "-------------------------------------------------------");
	 
	            // Condition to check pointer pointing
	            while (rs.next()) {
	                System.out.println(rs.getString(1) + "\t\t"
	                                   + rs.getString(2)
	                                   + "\t\t"
	                                   + rs.getString(3));
	            }
	 
	            // Step 7: Close the connection
	           // con.commit();
	          //  con.close();
	        }
	 
	        // Catch block to handle exceptions
	        catch (Exception e) {
	 
	            // Print line number if exception occurred
	            System.out.println(e);
	        }
		}
}
