package artMySqlFroup;
import java.sql.*;  
public class ExamplePreparedStatement {
	   static Connection conn = null;
	   static final String DB_URL = "jdbc:mysql://localhost:3306/multipleexample";
	   static final String USER = "root";
	   static final String PASS = "root";
	  // static final String data = "SELECT * FROM SalaryofEmployee WHERE salary>=20000";

	public static void main(String args[]){  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/Multipleexample","root","root");  
		

		PreparedStatement stmt=con.prepareStatement("insert into students values(?,?,?)");  
		stmt.setString(1,"S123");//1 specifies the first parameter in the query  
		stmt.setString(2,"Ratan");  
		stmt.setString(3, "ECE");
		  
		int i=stmt.executeUpdate();  
		System.out.println(i+" record inserted");  
		  
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  
		}  
}
