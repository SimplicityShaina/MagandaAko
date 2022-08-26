package artMySqlFroup;

import java.sql.*;

public class updateSql {

	   static final String DB_URL = "jdbc:mysql://localhost/Application";
	   static final String USER = "root";
	   static final String PASS = "root";
	   static final String query1 = "SELECT id, first, last, age FROM Shaina";

	   public static void main(String args[]) 
		{  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/Application","root","root");  
			Statement st=con.createStatement();  
			
			// Display record before the update , create restultSet  
			ResultSet rs=st.executeQuery("SELECT * FROM Shaina"); 
			
			rs.next();  
			System.out.print("ID: " + rs.getInt("id"));
		    System.out.print(", Age: " + rs.getInt("age"));
		    System.out.print(", First: " + rs.getString("first"));
		    System.out.println(", Last: " + rs.getString("last"));
			// Update the record 
			String query1="UPDATE Shaina SET first= \"Zara\" where ID = 1";
			st.executeUpdate(query1);
			System.out.println("Data updated..");
			
			// Display the record 
			rs=st.executeQuery("SELECT * FROM Shaina"); 
				
			while (rs.next()) 
			{
			  System.out.print("ID: " + rs.getInt("id"));
		      System.out.print(", Age: " + rs.getInt("age"));
		      System.out.print(", First: " + rs.getString("first"));
		      System.out.println(", Last: " + rs.getString("last"));
			}	
			con.close();  
			
		}catch(Exception e){ System.out.println(e);} 
			
		}
}
