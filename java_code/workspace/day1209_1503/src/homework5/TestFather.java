package homework5;

public class TestFather {
	public static void main(String[] args) {
		Son s = new Son();
		//不能调用，因为子类中没有复写父类中的
		//abstract方法,所以子类也是抽象类，而抽象类不能创建对象
	}

}
