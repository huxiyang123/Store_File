package homework;
/*
 * 2 创建包含学号和姓名的Studnet类。
  模拟班长选举：初始化一定数量的Student对象，然后通过键盘根据选择学生的编号进行投票。票数需要提前指定。
 */
public class Student {
	private String name;
	private int number;
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number 要设置的 number
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "姓名：  "+name +"   学号：  "+number;
	}
	public Student(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}	
}
