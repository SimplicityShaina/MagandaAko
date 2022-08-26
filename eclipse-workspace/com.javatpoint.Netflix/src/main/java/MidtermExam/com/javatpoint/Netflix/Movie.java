package MidtermExam.com.javatpoint.Netflix;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "Movie") 

public class Movie {


@Id	
private int MovieID;  
private String Name;
private int SequenceNumber;
private String Director;  
  
public int getMovieid() {  
    return MovieID;  
}  
public void setMovieid (int MovieID) {  
    this.MovieID = MovieID;  
}  
public String getname() {  
    return Name;  
}  
public void setname(String Name) {  
    this.Name = Name;  
}  
public int getSequencenumber() {  
    return SequenceNumber;  
}  
public void setSequencenumber (int SequenceNumber) {  
    this.SequenceNumber = SequenceNumber;  
} 

public String getdirector() {  
    return Director;  
}  
public void setdirector(String Director) {  
    this.Director = Director;  
} 
 

}

 