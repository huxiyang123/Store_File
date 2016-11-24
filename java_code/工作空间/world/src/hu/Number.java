package hu;

public class Number {
	private String name;
	private int num;

	@Override
	public String toString() {
		return "Number [name=" + name + ", num=" + num + "]";
	}
	public Number(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
}
