package homework2;

public class Child extends Father {
	void study(){
		System.out.println("子类成员方法"+name+age+sex);
		super.say();    //调用父类中的say()方法
	}
}
