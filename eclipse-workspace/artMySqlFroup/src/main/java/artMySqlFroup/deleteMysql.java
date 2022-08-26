package artMySqlFroup;

import java.sql.*;



import java.util.Scanner;

public class deleteMysql {
	 static Connection conn = null;
 //  static final String QUERY = "SELECT id, first, last, age FROM employ";
	 static Scanner scan = new Scanner(System.in);
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			String userName = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/Assignment";   
			Connection con=DriverManager.getConnection(url, userName, password);  
			
			
			
			System.out.print("Enter the employee ID to delete data: ");
	    	int numberID = scan.nextInt();
	    	String data = "DELETE FROM SalaryofEmployee where ID=' "+numberID+"'";
	    	Statement st=con.createStatement();  
	    	st.execute(data);
	    	System.out.println("Employee data has been deleted...");
	    	
	    	 
	    	ResultSet rs=st.executeQuery("SELECT * FROM Salaryofemployee"); 
	    	
	    	System.out.println("Employee:");
	    	
			while (rs.next()) {
			  System.out.print("ID: " + rs.getInt("id"));
		      System.out.print(", Age: " + rs.getInt("age"));
		      System.out.print(", First: " + rs.getString("first"));
		      System.out.println(", Last: " + rs.getString("last"));
		      System.out.println(",Salary: " + rs.getString("Salary"));
			}	
	    	st.close();
			con.close();  
			
			}catch(Exception e){ 
				e.printStackTrace();
			} 
	}
}
