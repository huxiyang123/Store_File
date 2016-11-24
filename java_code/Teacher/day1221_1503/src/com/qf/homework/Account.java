package com.qf.homework;

public class Account {
	private String name;
	private double saving;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaving() {
		return saving;
	}

	public void setSaving(double saving) {
		this.saving = saving;
	}

	public Account(String name, double saving) {
		super();
		this.name = name;
		this.saving = saving;
	}

}
