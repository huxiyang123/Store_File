package study;

public class Number {
	private String name;
	private int no;
	
	public void setNo(int no) {
		this.no = no;
	}
	public Number(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}
	
	@Override
	public String toString() {
		return "  Number [name=" + name + ", no=" + no + "]";
	}
	
	
}
