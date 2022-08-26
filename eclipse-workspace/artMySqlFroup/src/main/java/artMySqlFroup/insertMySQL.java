package artMySqlFroup;
import java.sql.*;


import java.util.Scanner;


public class insertMySQL {
		 static Connection conn = null;
	 //  static final String QUERY = "SELECT id, first, last, age FROM employ";
		 static Scanner scan = new Scanner(System.in);
		   
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try{  
				//Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/assignment","root","root");  
				 

		    	//String data = "DELETE FROM SalaryofEmployee where ID=' "+numberID+"'"; 
		    	String data = "INSERT INTO salaryofemployee VALUES (?,?,?,?,?)";       
		    	PreparedStatement ps1= con.prepareStatement(data);
		    	for (int i = 0; i < 1; i++) {
					System.out.print("Enter the employee ID: ");
			    	int ID = scan.nextInt();
			    	
			    	System.out.print("Enter your age: ");
			    	int age = scan.nextInt();
			    	
			    	System.out.print("Enter your First Name: \n");
			    	String first = scan.next();
			    	
			    	System.out.print("Enter your Last Name: ");
			    	String last = scan.next();
			    	
			    	System.out.print("Enter how much your salary: ");
			    	int salary = scan.nextInt();
			    	
			    	ps1.setLong(1, ID);
	                ps1.setLong(2, age);
	                ps1.setString(3, first);
	                ps1.setString(4, last);
	                ps1.setLong(5, salary);
	                // adding to batch
	                ps1.addBatch();
	            }
		        // executing the batch
	            ps1.executeBatch();
	           
	            // viewing the table
	            ResultSet rs
	                = ps1.executeQuery("Select * from salaryofemployee\n");
	            System.out.print("Successfully add the data of employee\n");
	            System.out.print("Updating the data...\n");
	            System.out.println(
	                "ID \tAge\tFirst Name\tLast Name\tSalary");
	            System.out.println(
	                "-------------------------------------------------------");
	            while (rs.next()) {
	                System.out.println(rs.getInt(1) +"\t"
	                                   + rs.getInt(2)+"\t"
	                                   + rs.getString(3) +"\t\t"
	                                   + rs.getString(4) +"\t\t"
	                                   + rs.getInt(5));
	            }
	         //   con.commit();
	            con.close();
	        }
	 
	        catch (Exception e) {
	            System.out.println(e);
	        }
	    }
}
