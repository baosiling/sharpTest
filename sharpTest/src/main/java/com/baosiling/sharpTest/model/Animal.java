package com.baosiling.sharpTest.model;

public class Animal {
	private String name;
	private String howl;
	
	public String move(Object str){
		return "animal"+"_"+str.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHowl() {
		return howl;
	}

	public void setHowl(String howl) {
		this.howl = howl;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", howl=" + howl + "]";
	}
	
	
}
