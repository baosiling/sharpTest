package com.baosiling.sharpTest.threadsafe;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
	private static Map<String, String> map = new ConcurrentHashMap<String, String>();

	static {
		for (int i = 0; i < 1000; i++) {
			String str = String.valueOf(i);
			map.put(str, str);
		}
	}

	public static void main(String[] args) {
		new Thread(new MapListThread(map)).start();
		new Thread(new MapRemoveThread(map)).start();
	}
}

class MapListThread implements Runnable {
	private Map<String, String> map;

	public MapListThread(Map<String, String> map) {
		this.map = map;
	}

	public void run() {
		Iterator<String> iter = map.values().iterator();
		while (iter.hasNext()) {
			iter.next();
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MapRemoveThread implements Runnable {
	private Map<String, String> map;

	public MapRemoveThread(Map<String, String> map) {
		this.map = map;
	}

	public void run() {
		for (int i = 200; i < 900; i++) {
			String str = String.valueOf(i);
			map.remove(str);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Remove OK. map.size:" + map.size());
	}
}