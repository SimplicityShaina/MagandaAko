package artMySqlFroup;

import java.sql.*;

public class SortFristName {
	   static final String DB_URL = "jdbc:mysql://localhost/Assignment";
	   static final String USER = "root";
	   static final String PASS = "root";
	   static final String data = "SELECT * FROM SalaryofEmployee ORDER BY first ASC;";

	   public static void main(String args[]) 
		{  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/Assignment","root","root");  
			Statement st=con.createStatement();  
			
			// Display record before the update , create restultSet  
			ResultSet rs=st.executeQuery("SELECT * FROM SalaryofEmployee ORDER BY first ASC;"); 
			
		    System.out.println("Sorting employee by their Name...");
	        // int rowCount = 0;
	         // Row-cursor initially positioned before the first row of the 'ResultSet'.
	         // rset.next() inside the whole-loop repeatedly moves the cursor to the next row.
	         // It returns false if no more rows.
	        while(rs.next()) {   // Repeatedly process each row
	        	  System.out.print("ID: " + rs.getInt("id"));
			      System.out.print(", Age: " + rs.getInt("age"));
			      System.out.print(", First: " + rs.getString("first"));
			      System.out.println(", Last: " + rs.getString("last"));
			      System.out.println(", Salary: " + rs.getString("salary"));
				}	
		
	        con.close();  
	        
		}catch(Exception e){ System.out.println(e);} 
			
		}
}
