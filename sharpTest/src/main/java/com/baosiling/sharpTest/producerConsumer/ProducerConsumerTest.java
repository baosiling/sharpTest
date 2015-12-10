package com.baosiling.sharpTest.producerConsumer;

public class ProducerConsumerTest {
	public static void main(String[] args){
		Container container = new Container();
		Producer p = new Producer(container);
		Consumer c = new Consumer(container);
		
		p.start();
		c.start();
	}
}


class Producer extends Thread {
	
	private Container container;
	
	Producer(Container container){
		this.container = container;
	}
	
	@Override
	public void run() {
		//进入停车场
		for(int i=0; i<20; i++){
			Car car = new Car(i);
			container.push(car);
			System.out.println(car+" 进入了停车场");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumer extends Thread {
	
	private Container container;
	
	Consumer(Container container){
		this.container = container;
	}

	@Override
	public void run() {
		//离开停车场
		for(int i=0; i<20; i++){
			Car car = container.pop();
			System.out.println(car+" 离开了停车场");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Container {
	int index = 0;
	Car[] arrCar = new Car[6];
	
	public synchronized void push(Car car) {
		while(index == arrCar.length){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();
		arrCar[index] = car;
		this.index++;
	}
	
	public synchronized Car pop() {
		while(index == 0){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();
		this.index--;	//push第n个之后，this.index++ 栈顶指针变为n+1
		return arrCar[index];
	}
}

class Car {
	private int id;
	
	Car(int id){
		this.id = id;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + "]";
	}
	
}