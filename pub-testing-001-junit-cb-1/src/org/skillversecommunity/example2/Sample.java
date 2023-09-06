package org.skillversecommunity.example2;

/**
 * A trivial class to demonstrate Junit Testing. 
 * This class will be tested for
 *  
 * @author SkillVerse Community
 * @Since 26.08.2023
 * @version 1.0
 *
 */
public class Sample {

	int _a; //instance variable, notice the naming convension
	int _b;
	
	/**
	 * Constructor 
	 * 
	 * @param a - int to initialize _a 
	 * @param b - int to initialize _b
	 */
	public Sample(int a, int b)
	{
		this._a = a;
		this._b = b;
	}
	
	/**
	 * Finds maximum between _a and _b.
	 * @return the max number
	 */
	public int findMax()
	{
		int c;
		if(_a > _b)
			c = _a;
		else
			c = _b;
		return c;
	}
	
	/**
	 * Finds minimum between _a and _b.
	 * @return the min number
	 */
	public int findMin()
	{
		int c;
		if(_a < _b)
			c = _a;
		else
			c = _b;
		return c;
	}
	
}
