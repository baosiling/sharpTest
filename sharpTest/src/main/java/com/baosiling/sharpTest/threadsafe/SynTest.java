package com.baosiling.sharpTest.threadsafe;

public class SynTest {

	private static Object _lock = new Object();
	
	// 非同步
	public void method(Thread thread) {
		System.out.println("begin " + thread.getName());
		try {
			Thread.sleep(2000);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("end " + thread.getName());
	}
	
	//同步方法
	public synchronized void method1(Thread thread){
		System.out.println("begin " + thread.getName());
		try {
			Thread.sleep(2000);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("end " + thread.getName());
	}
	
	//同步代码块
	public void method2(Thread thread){
		synchronized(SynTest.class){
			System.out.println("begin " + thread.getName());
			try {
				Thread.sleep(2000);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			System.out.println("end " + thread.getName());
		}
	}
	
	//同步对象锁
	public void method3(Thread thread){
		synchronized(_lock){
			System.out.println("begin " + thread.getName());
			try {
				Thread.sleep(2000);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			System.out.println("end " + thread.getName());
		}
	}
	
}