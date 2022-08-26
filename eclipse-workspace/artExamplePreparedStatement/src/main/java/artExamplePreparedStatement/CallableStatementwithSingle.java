package artExamplePreparedStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStatementwithSingle {
	   public static void main(String[] args) {
	        String jdbcUrl = "jdbc:mysql://localhost:3306/multipleexample";
	        String username = "root";
	        String password = "root";
	        String SQLFILE7 = "call retreive_users()";

	        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password); 
	        CallableStatement stmt = conn.prepareCall(SQLFILE7); 
	        ResultSet rs = stmt.executeQuery();) {

	            while (rs.next()) {
	                System.out.println("STUDENT ID = " + rs.getString(1) 
	                			+ ", NAME = "  + rs.getString(2) 
	                			+ ", DEPARTMENT = " + rs.getString(3));
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
}
