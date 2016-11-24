package com.qf.lesson;

public class TestAnimal {

	public static void main(String[] args) {
		Animal<String,Integer> a = new Animal<String,Integer>();
        a.setAge(18);
        a.setName("zhangsan");
        
        System.out.println(a.getAge());
        System.out.print(a.getName());
        
        MathUtil  m = new MathUtil();
        String s = m.add("hello");
       
	}

}
