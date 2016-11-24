package study;

public class TestAnimal {

	public static void main(String[] args) {
		Animal<String,Integer> an = new Animal<String,Integer>();
		an.setAge(18);
		an.setName("zhangsan ");
		System.out.println(an.getName()+an.getAge());
	}

}
