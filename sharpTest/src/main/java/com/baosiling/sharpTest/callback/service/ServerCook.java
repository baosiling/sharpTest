package com.baosiling.sharpTest.callback.service;

public class ServerCook {
	
	private Price price;
	
	public void execute(){
		if(price.getMoney() > 10){
			System.out.println("Cooking.........");
		}else{
			System.out.println("Money is not Enough.");
		}
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}
}
