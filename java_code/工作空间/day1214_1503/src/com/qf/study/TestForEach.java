package com.qf.study;

public class TestForEach {

	public static void main(String[] args) {
		int[] ages = new int[5];
		int a = 4;
		for(int i=0;i<ages.length;i++){
			ages[i] = a+i;
			System.out.println(ages[i]);	//ages[i]����ʡ����.toString();
		}
		
		User[] users = new User[6];
		for(int i=0;i<users.length;i++){
			User u = new User();
			u.setName("����"+i);
			u.setAge(a+i);
			
			System.out.println(u.toString());
			users[i] = u;
		}
		//��forEachѭ��������ӡusers����
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
