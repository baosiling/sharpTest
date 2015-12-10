package com.baosiling.sharpTest.model;

public class Cat extends Animal{
	
	private String fur;
	private String tail;
	
	public String getFur() {
		return fur;
	}

	public void setFur(String fur) {
		this.fur = fur;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}
	
	public void catchMouse(){
		
	}

	@Override
	public String toString() {
		return "Cat [fur=" + fur + ", tail=" + tail + "]";
	}
	
	
}
