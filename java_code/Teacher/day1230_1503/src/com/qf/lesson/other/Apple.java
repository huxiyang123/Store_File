package com.qf.lesson.other;
/*
 * 共享数据区中的数据对应的类
 */
public class Apple {
	private String name;
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

	public Apple(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}

	@Override
	public String toString() {
		return "Apple [name=" + name + ", no=" + no + "]";
	}

}
