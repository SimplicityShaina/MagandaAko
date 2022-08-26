package HibernateStream.com.HibernateStream;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import HibernateStream.com.HibernateStream.movie;
import HibernateStream.com.HibernateStream.moviemain;

import java.util.Scanner;

public class App 
{ 
	
    public static void main( String[] args )
    {
    	try {
		//Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/shaina?serverTimezone=UTC","root","root");  
        ApplicationContext context=new ClassPathXmlApplicationContext("hibernet.config.xml");
        moviemain streamdao= (moviemain) context.getBean("moviemain");


			Scanner opt = new Scanner(System.in);
		    Scanner intScanner = new Scanner(System.in);
		    Scanner scMovName = new Scanner(System.in);
		    Scanner scDirect = new Scanner(System.in);
		    boolean mainTask = true;
		    
	    	String data = "INSERT INTO yoko VALUES (?,?,?,?)";       
		    System.out.println("Good Day");
		    System.out.println("Would you like to add a movie to the Stream? Y/N");
	    	PreparedStatement ps1= con.prepareStatement(data);
		    char option = opt.next().charAt(0);
		    if(option == 'Y' || option == 'y') {
		    	while(mainTask) {
		    	System.out.println("Please Provide details ");
		    	System.out.print("Please input Movie ID: ");
		    	int movieIDInput = intScanner.nextInt();
		    	
		    	System.out.print("Please input Movie Name: ");
		    	String movieNameInput = scMovName.nextLine();
		    	
		    	System.out.println("Please input Sequence Number: ");
		    	int sqcNumberInput = intScanner.nextInt();
		    	
		    	System.out.print("Please input Director Name of the Movie: \n");
		    	String directInput = scDirect.nextLine();
		    	
		    	//movie movieSet = new movie();

		        ps1.setLong(1, movieIDInput);  
		        ps1.setString(2, movieNameInput);
		        ps1.setLong(3, sqcNumberInput);
		        ps1.setString(4, directInput);

		        // adding to batch
                ps1.addBatch();
            
	        // executing the batch
            ps1.executeBatch();

		        System.out.println("successfully saved");  
		        System.out.println("Do you still want to enter a movie to the database? Y/N");
		        char option2nd = opt.next().charAt(0);
		        if(option2nd == 'Y' || option2nd == 'y') {
		        	mainTask = true;
		        	
		        }else if(option2nd == 'N' || option2nd == 'n'){
		        	mainTask = false;
		        	System.out.println("Thank you have a good day");
		      
         //   con.commit();
		       con.close();
		        }
		        }
		    
		    }else if(option == 'N' || option == 'n') {
		    	System.out.println("Thank you have a good day");
		    }else {
		    	System.out.println("Please Try Again");
		    }
    	}
		    catch (Exception e) {
	            System.out.println(e);
	        }
        
    }
		    
					
    }
		    
        
    

