package com.qf;

public class Father {
	int age;
	String name ;
	char sex;
	static void eat(){
		//System.out.println("����"+name+age+sex);
		System.out.println("����");
	}
	void say(){
		System.out.println("this ����");
	}
	public Father(int age) {
		
		this.age = age;
		this.name = name;
		this.sex = sex;
		this.say();			//this���ó�Ա����ʱ�����Բ����ڵ�һ��
		System.out.println("����"+age);
	}
	
}
