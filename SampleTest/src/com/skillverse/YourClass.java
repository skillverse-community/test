package com.skillverse;

public class YourClass {

	private String _str;
	
	public YourClass(String str)
	{
		this._str = str;
	}
	
	public String doubleTheString()
	{
		return _str.concat(_str);
	}
}
