package homework;
/*
 * 2  定义一个MathUtil工具类，提供以下的静态方法，并且通过测试类进行测试：
   1）两个int类型的乘积。
   2）两个float类型相减的结果

 */
public class MathUtil {
	static String country = "中国";
	static int a=2,b=3;			//静态变量只能由静态方法用
	static int multiply(){
		 return a*b;
	}
	static float subtract(float m,float n){
		return m-n;
	}
}
