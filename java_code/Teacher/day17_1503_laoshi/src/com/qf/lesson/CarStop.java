package com.qf.lesson;

public class CarStop {

	public static void main(String[] args) {
		MyStack<Car> carStop = new MyStack<Car>();
        for(int i = 1;i<11;i++){
        	Car car = new Car("brand"+i,"no"+i);
        	carStop.add(car);
        }
        
        
        for(int i = 0;i<10;i++){
        	System.out.println(carStop.get());
        }
        
	}

}
