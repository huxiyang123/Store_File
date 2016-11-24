package day07_1503;

public class TestMathUtil {

	public static void main(String[] args) {
		MathUtil m = new MathUtil();
        int result = m.add(2, 3);
        
		int result1 = MathUtil.add(2, 3);//static方法调用： 类名.方法名();
		
        double d = Math.random();
        System.out.println(result);
        
        
        
	}

}
