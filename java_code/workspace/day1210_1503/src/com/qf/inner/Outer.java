package com.qf.inner;
/*
 * �ڲ��ࣺ���������������档�����ڲ��������ⲿ�ࣻ�ڲ������ⲿ���һ���֡�
 * 	  ���ã�ʹ���ⲿ���˽�з���
 *    �ص㣺���Է����ⲿ���˽��private��Ա
 *    ���ࣺ
 *       1 ��Ա�ڲ��ࣺ
 *    		���Ե���һ����ͨ�ĳ�Ա������
 *    		���壺
 *      		[���η�]  �ⲿ����{
 *      			�ⲿ��ĳ�Ա������
 *      			�ⲿ��ĳ�Ա������
 *                  [���η�]   �ڲ�����{
 *                  
 *                  }
 *      		}
 *      	���÷�ʽ:����ͨ���ⲿ��Ķ���������
 *      		1) �ⲿ����  ���� = new �ⲿ����();
 *      	 	2) �ⲿ����.�ڲ����� �ڲ������ = �ⲿ����().new �ڲ�����();
 *      
 *       2 ��̬�ڲ���:ʹ��static���ε��ڲ��࣬�����ⲿ���һ����̬��Ա
 *       	���÷�ʽ��
 *       		�ⲿ����.�ڲ����� �ڲ������ = �ⲿ����().new �ڲ�����();
 *       3 �ֲ��ڲ��ࣺ�ڷ����ж�����ڲ��ࡣֻ��ʹ��Ĭ�����η�
 *       
 *       4 �����ڲ��ࣺ���ڳ�����ͽӿ�
 *           	new �������ӿ�(){
 *              	�������ӿ��з�����ʵ��
 *              }
 *      ע������ڲ���ֻ��ʹ��һ�Σ�����ʹ�������ڲ��ࣻ����ڵ�ǰ���ж��ʹ�ã�����
 */
public class Outer {
	private String name1 = "Outer��";
	
	private static String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	class Inner{
		private int age = 16;
		public void display(){
			System.out.println("����"+name+";����"+this.age);
		}
	}
	public void say(){			//�ֲ��ڲ���
		class Inner{
			String name2;
			
		}
	}
}