package com.baosiling.sharpTest.deadlock;


/**
 * 死锁实例*/
public class DeadLockTest implements Runnable {

	private int flag = 1;
	
	private static Object o1 = new Object();
	
	private static Object o2 = new Object();
	
	public void run() {
		System.out.println("flag="+flag);
		if(flag == 1){
			
			synchronized(o2){
				//do something
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				synchronized(o1){
					System.out.println("flag111111111111111111执行");
				}
			}
			
			
		}
		
		if(flag == 0){
			
			synchronized(o1){
				//do something
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				synchronized(o2){
					System.out.println("flag000000000000000000执行");
				}
			}
		}
	}
	
	public static void main(String[] args){
		DeadLockTest dl = new DeadLockTest();
		dl.flag = 1;
		DeadLockTest d2 = new DeadLockTest();
		d2.flag = 0;
		
		Thread t1 = new Thread(dl);
		Thread t2 = new Thread(d2);
		
		t1.start();
		t2.start();
		
	}
}
