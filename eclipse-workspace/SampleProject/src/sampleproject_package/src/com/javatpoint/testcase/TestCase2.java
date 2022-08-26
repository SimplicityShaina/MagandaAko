package sampleproject_package.src.com.javatpoint.testcase;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sampleproject_package.src.com.javatpoint.logic.*;

public class TestCase2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}
	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@Test
	public void testFindMax(){
		System.out.println("test case find max");
		assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
		assertEquals(0,Calculation.findMax(new int[]{-12,-3,-4,-2}));
		 assertEquals((int)4.4,Calculation.findMax(new int[]{ (int)4.3,(int) -4.5, (int)4.4}));
	}
	@Test
	public void testCube(){
		System.out.println("test case cube");
		assertEquals(27,Calculation.cube(3));
		assertEquals(-64,Calculation.cube(-4));
	}
	@Test  
    public void testReverseWord(){  
        System.out.println("test case reverse word");  
        assertEquals("ym eman si nahk ",Calculation.reverseWord("my name is khan") );
        assertEquals("YM EMAN SI ANIAHS ",Calculation.reverseWord("MY NAME IS SHAINA") );  
        assertEquals("AAA ",Calculation.reverseWord("AAA") );  
    }  
	
	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after class");
	}

}
