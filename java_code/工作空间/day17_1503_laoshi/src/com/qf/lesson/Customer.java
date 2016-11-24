package com.qf.lesson;

public class Customer {

	public static void main(String[] args) {
		MyQueue<Car> outerDoor = new MyQueue<Car>();
		//模拟停车场出口处排队
        for(int i = 0;i<10;i++){
        	Car c = new Car("brand"+i,"no"+i);
        	outerDoor.add(c);
        }
        
        for(int i = 0;i<10;i++){
        	System.out.println(outerDoor.get());
        }
	}

}
