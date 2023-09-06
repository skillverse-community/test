package org.skillversecommunity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleTest {

	static int counter = 0;
	String fileName;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception { 
		System.out.println("I am before class");
		// Have the db connection
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//Close the db connection
	}

	@Before
	public void setUp() throws Exception {
		if(counter == 0)
			fileName = "sample1.txt";
		else
			fileName = "sample2.txt";
		System.out.println("I am setup");
		// have the file object here with a particular file name
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("I am tear down");
		//delete the file object
	}

	@Test
	public void test_readFromFileWriteToDB() {
		System.out.println("I am test1");
		//businessLogic
		counter = counter + 1;
	}
	
	@Test
	public void test_readFromDBWriteToFile() {
		System.out.println("I am test2");
	}
	
	

}
