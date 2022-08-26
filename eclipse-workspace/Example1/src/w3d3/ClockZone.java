package w3d3;
import java.time.Clock;

public class ClockZone {
	public static void main(String[] args) {
	    Clock c = Clock.systemDefaultZone();    
	    System.out.println(c.getZone());
	  }

}
