package org.skillversecommunity.example1;

/**
 * A trivial class to demonstrate Junit Testing. 
 * This class will be tested for
 *  
 * @author SkillVerse Community
 * @Since 26.08.2023
 * @version 1.0
 *
 */
public class MyClass {

	String _str1; //instance variable - notice the naming convention
	String _str2;
	
	/**
	 * Constructor
	 * 
	 * @param s1 String to initialize _str1
	 * @param s2 String to initialize _str2
	 */
	public MyClass(String s1, String s2)
	{
		this._str1 = s1;
		this._str2 = s2;
	}

	/**
	 * Method to return the difference of length (always positive) 
	 * of two instance variables
	 * 
	 * This method has bug
	 * Positive testing: 
	 * A. both the string are not null
	 * B. _str1 has length more than or equal to _str2
	 * Negative Testing:
	 * A. One or both of the strings are null. 
	 * B. _str1 length is less than _str2 length 
	 * @return
	 */
	public int getLengthDifference()
	{
		if(_str2 == null)
			throw new ArithmeticException();
		return _str1.length() - _str2.length();
	}
}
