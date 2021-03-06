package homewowk14_17;
/*
 * 	1  创建一个Student类，属性方法自定义。 创建一个测试类TestStudent，包含一个方法test()，
 * 在方法中定义一个Student类型的引用变量但不指向任一个对象且初始化为null。
    然后调用引用变量的方法。
	2  在TestStudent中的main方法中调用test(),观察结果，分析原因。
	3  使用自定义异常解决上面的问题。
 */
public class TestException15 {

	public static void main(String[] args) {
		try {
			test();
		} catch (StudentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	public static void test() throws StudentException{
		Student stu = null;
		if(stu==null){
			throw new StudentException("stu为空，无法调用对应的方法。");
		}
		stu.say();
	}

}
class Student{
	public void say(){
		System.out.println("好人一生平安！");
	}
}
class StudentException extends Exception{
	StudentException(String message){
		super(message);
	}
}
