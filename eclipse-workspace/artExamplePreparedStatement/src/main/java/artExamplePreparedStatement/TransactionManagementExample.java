package artExamplePreparedStatement;
import java.sql.*;  
import java.io.*;  
public class TransactionManagementExample {
	  static Connection conn = null;
	   static final String DB_URL = "jdbc:mysql://localhost:3306/multipleexample";
	   static final String USER = "root";
	   static final String PASS = "root";
	   
	public static void main(String args[]){  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/Multipleexample","root","root");  
		

	  
		con.setAutoCommit(false);  
		  
		PreparedStatement ps=con.prepareStatement("Insert into students values(?,?,?)");  
		  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		while(true){  
		  
		System.out.println("Enter Student ID");  
		String s1=br.readLine();  
		//int id=Integer.parseInt(s1);  
		  
		System.out.println("Enter Name");  
		String name=br.readLine();  
		  
		System.out.println("Enter Department");  
		String s3=br.readLine();  
		//int salary=Integer.parseInt(s3);  
		  
		ps.setString(1,s1);  
		ps.setString(2,name);  
		ps.setString(3,s3);  
		ps.executeUpdate();  
		  
		System.out.println("commit/rollback");  
		String answer=br.readLine();  
		if(answer.equals("commit")){  
		con.commit();  
		}  
		if(answer.equals("rollback")){  
		con.rollback();  
		}  
		  
		  
		System.out.println("Want to add more records y/n");  
		String ans=br.readLine();  
		if(ans.equals("n")){  
		break;  
		}  
		  
		}  
		con.commit();  
		System.out.println("record successfully saved");  
		  
		con.close();//before closing connection commit() is called  
		}catch(Exception e){System.out.println(e);}  
		  
		}
}
