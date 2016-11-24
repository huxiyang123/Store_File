package homework6;

public class TestUsre {
	public static void main(String[] args) {
		User u = new User();
		u.name  = "张三";
		//u.password; 这个成员变量被私有化了，不能被对象调用
		u.fun();
		u.say();
	}
}

