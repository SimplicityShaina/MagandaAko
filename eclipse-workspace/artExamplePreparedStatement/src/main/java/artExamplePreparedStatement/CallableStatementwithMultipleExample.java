package artExamplePreparedStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStatementwithMultipleExample {
	 public static void main(String[] args) {
	        String jdbcUrl = "jdbc:mysql://localhost:3306/multipleexample";
	        String username = "root";
	        String password = "root";
	        String SQLFILE7 = "call retreive_different_results1 ()";

	        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password); 
	        		CallableStatement stmt = conn.prepareCall(SQLFILE7);) {

	            boolean hasRs = stmt.execute();

	            System.out.println();
	            // Get Product Names
	            if (hasRs) {
	                try (ResultSet rs = stmt.getResultSet()) {
	                    while (rs.next()) {
	                        System.out.println("NAME = " + rs.getString(1));
	                    }
	                }
	            }

	            // Get Total Price
	            if (stmt.getMoreResults()) {
	                try (ResultSet rs = stmt.getResultSet()) {
	                    if (rs.next()) {
	                        System.out.println("DEPARTMENT = " + rs.getString(1));
	                    }
	                }
	            }

	            // Get Max/Min Price
	            if (stmt.getMoreResults()) {
	                try (ResultSet rs = stmt.getResultSet()) {
	                    if (rs.next()) {
	                        System.out.println("Student count = " + rs.getInt(1));
	                    }
	                }
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
}
