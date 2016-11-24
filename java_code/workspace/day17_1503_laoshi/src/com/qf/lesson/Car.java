package com.qf.lesson;

public class Car {
	private String brand;
	private String no;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
	
	

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
