package com.qf.duoTai;

public class Chinese extends Man implements Mover{

	@Override
	void eat() {
		System.out.println("�����й��ˣ���ϲ�����档������");
	}

	@Override
	void sleep() {
		System.out.println("�����й��ˣ���ϲ��˯����������");
	}

	@Override
	public void move() {
		System.out.println("�����й��ˣ���ϲ�������г�");
		
	}

	@Override
	public void say() {
		System.out.println("�����й��ˣ�˵�й���������������");
		
	}
	
	
}
