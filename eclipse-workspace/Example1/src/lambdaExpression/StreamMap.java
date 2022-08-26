package lambdaExpression;

import java.util.*;

public class StreamMap {
	// Driver code
	  public static void main(String[] args)
	  {

	    System.out.println("The stream after applying "
	            + "the function is : ");

	    // Creating a list of Integers
	    List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);

	    // Using Stream map(Function mapper) and
	    // displaying the corresponding new stream
	    list.stream().map(number -> number * 3).forEach(System.out::println);
	  }

}
