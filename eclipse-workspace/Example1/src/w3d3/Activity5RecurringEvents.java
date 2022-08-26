package w3d3;
import java.time.LocalDate;
import java.time.Month;

public class Activity5RecurringEvents {
	 public static void main(String args[]) {

	 // declare variables for birthday
    int birthDate = 30;
    Month birthMonth = Month.OCTOBER;

    // get current date
    LocalDate currentDate = LocalDate.now();
    System.out.println("Today's Date: " + currentDate);

    // get current date and month
    int date = currentDate.getDayOfMonth();
    Month month = currentDate.getMonth();

    if(date == birthDate && month == birthMonth) {
      System.out.println("HAPPY BIRTHDAY TO YOU !!");
    }
    else {
      System.out.println("Today is not my birthday.");
    }
   }
}
