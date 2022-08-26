package artMySqlFroup;
import java.sql.*;

public class SalarySQL {
	   static final String DB_URL = "jdbc:mysql://localhost/Assignment";
	   static final String USER = "root";
	   static final String PASS = "root";
	   static final String data = "SELECT * FROM SalaryofEmployee WHERE salary>=20000";

	   public static void main(String args[]) 
		{  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/Assignment","root","root");  
			Statement st=con.createStatement();  
			
			// Display record before the update , create restultSet  
			ResultSet rs=st.executeQuery("SELECT * FROM SalaryofEmployee WHERE salary>=20000"); 
		
	        System.out.println("Employees who have a salary of greater than 20,000:");
	        int rowCount = 0;
	         // Row-cursor initially positioned before the first row of the 'ResultSet'.
	         // rset.next() inside the whole-loop repeatedly moves the cursor to the next row.
	         // It returns false if no more rows.
	         while(rs.next()) 
	         {   // Repeatedly process each row
	        	int idofEmployee = rs.getInt("id");  //retrieve data
	        	int ageofEmployee = rs.getInt("age");  
	            String firstNmae = rs.getString("first");  
	            String LastName = rs.getString("last");  
	            int salary = rs.getInt("salary");        
	            System.out.println(idofEmployee + ", " + ageofEmployee + ", " + firstNmae + ", " + LastName + ", " + salary);
	            ++rowCount;
	         }
	         System.out.println("Total number of employees = " + rowCount);
		
	         con.close();  
		}catch(Exception e){ System.out.println(e);} 
			
		}
}
