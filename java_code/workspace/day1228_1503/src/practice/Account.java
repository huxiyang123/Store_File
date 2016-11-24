package practice;

public class Account {
	private double number;
	private String name;
	
	public double getNumber() {
		return number;
	}
	
	public void setNumber(double number) {
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Account(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}


}
