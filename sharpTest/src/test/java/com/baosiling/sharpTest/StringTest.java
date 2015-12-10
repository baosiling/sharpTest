package com.baosiling.sharpTest;

import org.junit.Test;

public class StringTest {
	
	@Test
	public void fun(){
		String s = "hello";
		s = s + null;
		System.out.println(s);
	} 
}
