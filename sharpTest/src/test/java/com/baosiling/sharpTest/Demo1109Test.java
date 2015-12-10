package com.baosiling.sharpTest;

import org.junit.Test;

import com.baosiling.sharpTest.model.Game;

public class Demo1109Test {

	@Test
	public void test() {
		System.out.println(this.getClass().getName());
	
	}
	
	@Test
	public void testInherit(){
		Game g = null;
		g.play("dnf");
	}

}
