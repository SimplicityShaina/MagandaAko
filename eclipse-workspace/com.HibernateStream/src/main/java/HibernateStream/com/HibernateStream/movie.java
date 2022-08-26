package HibernateStream.com.HibernateStream;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "yoko")
public class movie {
	
	@Id
	@Column(name = "MovieID")
	private int MovieID;
	@Column(name = "MovieName")
	private String Name;
	@Column(name = "SequenceNumber")
	private int SequenceNumber;
	@Column(name = "Diretor")
	private String director;
	
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
	    return director;  
	}  
	public void setdirector(String director) {  
	    this.director = director;  
	}  
	
	public movie(int MovieID, String Name, int SequenceNumber, String director) {
		super();
		this.MovieID = MovieID;
		this.Name = Name;
		this.SequenceNumber = SequenceNumber;
		this.director = director;
	}
	public movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "movie [Movie ID=" + MovieID + ", Movie Name=" + Name + ", Sequence Number=" + SequenceNumber + ", Director=" + director + "]";
	}
	

}
