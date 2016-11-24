package com.qf.study;

public class TestForEach {

	public static void main(String[] args) {
		int[] ages = new int[5];
		int a = 4;
		for(int i=0;i<ages.length;i++){
			ages[i] = a+i;
			System.out.println(ages[i]);	//ages[i]后面省略了.toString();
		}
		
		User[] users = new User[6];
		for(int i=0;i<users.length;i++){
			User u = new User();
			u.setName("张三"+i);
			u.setAge(a+i);
			
			System.out.println(u.toString());
			users[i] = u;
		}
		//用forEach循环遍历打印users数组
		for(User j:users){
			System.out.println(j);
		}
		System.out.println("-------------");

		for(int i=0;i<ages.length;i++){
			User u = new User();
			u.setName("jsjf"+i);
			u.setAge(a+i);
			
			System.out.println(u);
			///users[i] = u;
		}
	}

}
