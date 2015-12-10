package com.baosiling.sharpTest.callback.client;

import com.baosiling.sharpTest.callback.service.Price;
import com.baosiling.sharpTest.callback.service.ServerCook;

public class TestClient {
	
	public static void main(String[] args){
		
		ServerCook serverCook = new ServerCook();
		Price price = new DollarPrice();
		serverCook.setPrice(price);
		
		ClientCustomer clientCustomer = new ClientCustomer();
		clientCustomer.setServerCook(serverCook);
		clientCustomer.haveDinner();
		
	}
}
