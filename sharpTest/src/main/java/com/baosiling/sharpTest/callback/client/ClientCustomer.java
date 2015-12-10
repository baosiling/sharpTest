package com.baosiling.sharpTest.callback.client;

import com.baosiling.sharpTest.callback.service.ServerCook;

public class ClientCustomer {
	
	private ServerCook serverCook;
	
	public void haveDinner(){
		System.out.println("customer want to have dinner");
		System.out.println("calling the servercook");
		serverCook.execute();
	}

	public ServerCook getServerCook() {
		return serverCook;
	}

	public void setServerCook(ServerCook serverCook) {
		this.serverCook = serverCook;
	}

}
