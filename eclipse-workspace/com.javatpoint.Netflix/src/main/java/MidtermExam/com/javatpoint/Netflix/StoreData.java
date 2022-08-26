package MidtermExam.com.javatpoint.Netflix;

import java.util.Scanner;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

  
public class StoreData {  
public static void main(String[] args) {  
	
	
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

	SessionFactory factory = meta.getSessionFactoryBuilder().build();
	Session session = factory.openSession();
	Transaction t = session.beginTransaction(); 
    
	ApplicationContext movie = new ClassPathXmlApplicationContext("applicationContext.xml");
    
    Movie movieSet = (Movie) movie.getBean("movie", Movie.class);
    
	Scanner opt = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);
    Scanner scMovName = new Scanner(System.in);
    Scanner scDirect = new Scanner(System.in);
   // boolean mainTask = true;
    
    try {
        
    System.out.println("Good Day");
    System.out.println("Would you like to add a movie to the Stream? Y/N");
    char option = opt.next().charAt(0);
    
    	while(option == 'Y' || option == 'y') {
    	
    		System.out.println("Please Provide details ");
	    	System.out.print("Please input Movie ID: ");
	    	int movieIDInput = intScanner.nextInt();
	    	
	    	System.out.print("Please input Movie Name: ");
	    	String movieNameInput = scMovName.nextLine();
	    	
	    	System.out.println("Please input Sequence Number: ");
	    	int sqcNumberInput = intScanner.nextInt();
	    	
	    	System.out.print("Please input Director Name of the Movie: \n");
	    	String directInput = scDirect.nextLine();
	    	
	    	
	
	        movieSet.setMovieid(movieIDInput);  
	        movieSet.setname(movieNameInput);
	        movieSet.setSequencenumber(sqcNumberInput);
	        movieSet.setdirector(directInput);
	        
	        
	        session.save(movieSet);
	        session.flush();
	        session.clear();
	        System.out.println("successfully saved");  
	        System.out.println("Do you still want to enter a movie to the stream? Y/N");
	        option = opt.next().charAt(0);
    	
    	}

      
       
        
	    if(option == 'N' || option == 'n') {
	    	System.out.println("Thank you have a good day");
	  
	    }else {
	    	System.out.println("Please Try Again");
	    
	    }
		   t.commit();
	       
	       
	       
	}catch (Exception e) {
        System.out.println("You did not enter the expected input. Error: "+e);
        session.close();
    } 
		    
}  

}  