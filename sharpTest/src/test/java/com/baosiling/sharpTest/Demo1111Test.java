package com.baosiling.sharpTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

import com.baosiling.sharpTest.model.Animal;

public class Demo1111Test {

	@Test
	public void test() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Animal animal = new Animal();
//		animal.move("run");
		Method moveMethod = animal.getClass().getMethod("move",Object.class);
		String result = moveMethod.invoke(animal, "run").toString();
		System.out.println(result);
	}

}
