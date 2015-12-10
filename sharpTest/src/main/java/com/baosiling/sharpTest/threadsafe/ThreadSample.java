package com.baosiling.sharpTest.threadsafe;

import com.baosiling.sharpTest.model.Student;

public class ThreadSample implements Runnable {

	private Student stu;
	
	public void run() {
		MapOperation mo = new MapOperation();
		mo.save(stu);
	}

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}
	
	

}
