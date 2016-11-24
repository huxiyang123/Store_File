package com.qf.lesson;

public class Car {
	private String brand;
	private String no;

	
	

	public Car(String brand, String no) {
		super();
		this.brand = brand;
		this.no = no;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", no=" + no + "]";
	}

}
