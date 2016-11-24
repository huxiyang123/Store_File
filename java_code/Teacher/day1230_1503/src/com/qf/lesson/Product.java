package com.qf.lesson;

public class Product {
	//产品名称
	private String name;
	//产品编号
	private int no;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Product(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", no=" + no + "]";
	}

}
