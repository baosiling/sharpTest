package com.baosiling.sharpTest.callback.client;

import com.baosiling.sharpTest.callback.service.Price;

/**
 * 客户端提供的接口实现*/
public class DollarPrice implements Price{

	public float getMoney() {
		return 5;
	}

}
