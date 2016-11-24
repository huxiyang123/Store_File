package Exam;
/*
 * 2  创建一个工具类，提供方法，能计算两个int整数  float小数相加的方法.
 */
public class Tool {
	public int add(int a,int b){
		return a+b;
	}
	public float add(float a,float b){
		return a+b;
	}
	public static void main(String[] args) {
		//Tool t = new Tool();
		//t.add(1.3f, 2.3f);
		System.out.println("两个int型之和："+new Tool().add(1.3f, 2.3f));
		//t.add(29, 23);
		System.out.println("两个float型之和："+new Tool().add(29, 23));
	}
}
