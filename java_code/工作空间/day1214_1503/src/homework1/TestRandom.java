package homework1;
/*
 * 1  创建一个包含十个人名的数组，编写方法实现随机获取数组中的人名，打印出来。
 */
public class TestRandom {
	public static void main(String[] args) {
		String[] name = new String[]{"宋江","武松","林冲","晁盖","李逵","华荣","吴用","柴进","史进","朱横"};
		int num = (int)(Math.random()*10);
		System.out.println(name[num]);
		
	}
	
}
