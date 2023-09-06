package org.skillversecommunity.example1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Class to test MyClass
 * Notice: There is no setUp and tearDown methods
 * 
 * @author Skillverse Community
 * @since 26.08.2023
 * @version 1.0
 *
 */
public class TestMyClass {

	//Testing the case when len1 > len2 - This will Pass
	@Test // Considered to be a test case
	public void test_getLengthDifference_len1GreaterThanlen2() {
		String failingMessage = "length of string 1 is greater than length of string 2 : getLengthDifference(): MyClass";
		assertEquals(failingMessage,8, new MyClass("123456789", "1").getLengthDifference());
	}
	
	//Testing the case when len1 > len2 - This will fail - will be treated as failure of test case
	@Test // Considered to be a test case
	public void test_getLengthDifference_len1LesserThanlen2() {
		String failingMessage = "length of string 1 is lesser than length of string 2 : getLengthDifference(): MyClass";
		assertEquals(failingMessage,8, new MyClass("1", "123456789").getLengthDifference());
	}
	
	//Asserting Exception - This will pass
	@Test (expected = NullPointerException.class)// Considered to be a test case
	public void test_getLengthDifference_str1_is_null() {
		new MyClass(null, "123456789").getLengthDifference();
	}
	
	//Asserting Exception - This will fail - will be treated as error
	@Test (expected = NullPointerException.class)// Considered to be a test case
	public void test_getLengthDifference_str2_is_null() {
		new MyClass("1", null).getLengthDifference();
	}
	
	//Running of this code will give 
	//Runs: 4/4
	//Errors: 1
	//Failures:1
}
