package Exam;
/*
 * 2  ����һ�������࣬�ṩ�������ܼ�������int����  floatС����ӵķ���.
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
		System.out.println("����int��֮�ͣ�"+new Tool().add(1.3f, 2.3f));
		//t.add(29, 23);
		System.out.println("����float��֮�ͣ�"+new Tool().add(29, 23));
	}
}
