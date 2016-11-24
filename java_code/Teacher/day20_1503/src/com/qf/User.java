package com.qf;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -6092945120657656148L;
	private transient String name;
	private int age;
	private static String country;
    
	public static String getCountry() {
		return country;
	}

	public static void setCountry(String country) {
		User.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ";country="+country+"]";
	}
	
}
