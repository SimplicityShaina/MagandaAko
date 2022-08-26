package lambdaExpression;
import java.util.*;
import java.util.stream.*;

public class StreamwFIlter {
	// Driver code
	public static void main(String[] args)
	{

	 System.out.println("The stream after applying "
	         + "the function is : ");

	 // Creating a list of Integers
	 List<Integer> list = Arrays.asList(12, 14, 15, 15, 17, 13, 11, 9, 8, 7 );

	 // Using Stream map(Function mapper) and
	 // displaying the corresponding new stream
	 list.stream().filter(number -> number  < 15).forEach(System.out::println);
	}
}
