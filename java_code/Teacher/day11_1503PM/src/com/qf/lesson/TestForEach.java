package com.qf.lesson;

public class TestForEach {

	public static void main(String[] args) {
		int[] ages;
		ages = new int[4];
		int age = 18;
		for(int i = 0;i<ages.length;i++){
			ages[i] = age++;
		}
		//使用forEach循环，每次把当前索引处元素赋给声明的变量
//		for(int j:ages){
//			System.out.println(j);
//		}
		
		User[] users = new User[4];
        for(int i = 0;i<users.length;i++){
        	User u = new User();
        	u.setName("user"+i);
        	u.setAge(18+i);
        	users[i] = u;
        }
        
        for(int i=0;i<users.length;i++){
        	User u = users[i];
        	System.out.println(u);//System.out.println(users[i]);
        }
	}

}
