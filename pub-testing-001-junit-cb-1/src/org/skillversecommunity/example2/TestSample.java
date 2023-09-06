/**
 * 
 */
package org.skillversecommunity.example2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * This class tests Sample class
 * Note: setUp and tearDown methods have been used
 * @author Skillverse Community
 * @since 26.08.2023
 * @version 1:0
 *
 */
public class TestSample {

	Sample s1 = null;
	Sample s2 = null; 
	static int x = 0;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Going to test findMax and findMin of sample");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Tested findMax, findMin of Sample");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("Setting up for a particular test");
		System.out.println("Value of x = " + x);
		if(x == 0)
		{
			s1 = new Sample(1,5);
			s2 = new Sample(1,-5);
		}else {
			s1 = new Sample(2,2);
			s2 = new Sample(-2,2);
		}
		
	}
	

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("Tearing down a particular Test");
	}
	

	/**
	 * Test method for {@link org.skillversecommunity.example1.Sample#findMax()}.
	 */
	@Test
	public void testFindMax() {
		System.out.println("testing findMax of Sample");
		assertEquals("Both Positive Values", 5, s1.findMax()); //will pass
		assertEquals("One Positive, One Negative", 1, s2.findMax()); //will pass
		x = x + 1;
	
	}
	
	/**
	 * Test method for {@link org.skillversecommunity.example1.Sample#findMin()}.
	 */
	@Test
	public void testFindMin() {
		System.out.println("testing findMin of Sample");
		assertEquals("Both Positive", 2, s1.findMin()); //will pass
		assertEquals("One Positive, One Negative ", -2, s2.findMin()); //will pass 
		
	}
	
	//This code shows the use of setUp and execution order of other functions
	//This code also shows the how one text function can test a method with multiple object instances
	//here we did it with two objects
	
}
