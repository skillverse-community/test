package com.skillverse;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestYourClass {

	@Test(expected = NullPointerException.class)
	public void testNullStrInDoubleTheString() {
		String str = null;
		YourClass yc = new YourClass(str);
		System.out.println(yc.doubleTheString());
	}

}
