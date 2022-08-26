package example1;
import java.util.*;

public class TwoStringAreEqualOrNOt {
	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Enter First String: ");
        String string1 = in.nextLine();
        
        
        System.out.println("Enter Second String :");
        String string2 = in.nextLine();
       
        System.out.println("\nAre strings are same: ");
  
        if (string1.equals(string2) == true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
