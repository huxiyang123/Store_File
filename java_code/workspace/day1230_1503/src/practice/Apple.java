package practice;
/*
 * 共享数据区中对应数据的类
 */
public class Apple {
	private String name;
	private int no;
	
	@Override
	public String toString() {
		return "Apple [name=" + name + ", no=" + no + "]";
	}
	public Apple(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}
	
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
}
