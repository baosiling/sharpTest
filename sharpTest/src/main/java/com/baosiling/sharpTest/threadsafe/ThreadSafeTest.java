package com.baosiling.sharpTest.threadsafe;

public class ThreadSafeTest extends Thread{
	
	private SynTest synTest;
	
	public void run(){
		synTest.method1(this);
	}
	
	public ThreadSafeTest(SynTest synTest){
		this.synTest = synTest;
	}
	
	public static void main(String[] args){
		
		SynTest synTestTemp = new SynTest(); 
		
		for(int i=0; i<3; i++){
			ThreadSafeTest t = new ThreadSafeTest(synTestTemp);
			t.start();
		}
		
	}
	
}
