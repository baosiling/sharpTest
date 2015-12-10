package com.baosiling.sharpTest.threadsafe;

import java.util.HashMap;
import java.util.Map;

import com.baosiling.sharpTest.model.Student;

public class MapOperation{
	
	private static Map<String, Student> stuMap = new HashMap<String, Student>()	;
	
	public void save(Student stu){
		stuMap.put(stu.getName(), stu);
		System.out.println("put .....");
	}
	
	public void delete(String catName){
		stuMap.remove(catName);
	}
	
}
