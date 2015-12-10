package com.baosiling.sharpTest;

import org.junit.Test;


public class ReflectTest {
	
	@Test
	public void classToObject(){
		String catClassStr = "com.baosiling.sharpTest.Cat";
		try {
			Class.forName(catClassStr).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
