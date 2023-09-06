/**
 * 
 */
package com.skillverse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Lenovo
 *
 */
public class TestSquare {

	private Square s1 = null;
	
	private Square s2 = null;
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("I am setUpBeforeClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("I am taerDownAfterClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("I am setUp");
		s1 = new Square(10,10);
		s2 = new Square(5,8);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("I am tearDown");
	}

	@Test
	public void testGetAreaGivenLengthAndBreadth() {
		assertEquals("Computing Area of a Square Out of Length and Breadth", 100, s1.getArea());
	}
	
	@Test
	public void testCheckSquareGivenLangthAndBreadth()
	{
		assertEquals("Checks whether the length and breadth are equal", false, s2.checkSquare());
	}

}
