package com.baosiling.sharpTest;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Test;

public class UUIDTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		for(int i=0; i<100; i++){
			String uuidStr = UUID.randomUUID().toString();
			System.out.println(uuidStr);
		}
	}

}
