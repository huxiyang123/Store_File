package employee;
/*
 * 1 ����һ��Ա��Eomployee��.
     ���췽����
        �޲ι��췽��
        �����������ԵĹ��췽��
     ���ԣ�����   ����   нˮ(double)
     ����:  display()��ʾ ����  ����  нˮ
 */

public class Employee {
	String name;
	int age;
	double pay;
	Employee(){
		System.out.println("�޲ι��캯��");
	}
	Employee(String name1,int age1){
		name = name1;
		age = age1;	
		
	}
	double display(double pay1){
		pay = pay1;
		System.out.println("���� "+name+"  ����   "+age+"  нˮ  "+pay);
		return pay;
	}

}
