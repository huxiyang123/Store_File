package com.qf.study;
/*
 * ���飺�����洢һ����ͬ�������������ݽṹ��
 * �ص㣺
 * 	1   ���������ͱ�����
 *  2 ����һ�������壬��С�ǹ̶�������ġ�
 *  3 ����Ԫ���ǿɱ��
 *  4 ������±꣨���������Ǵ�0��ʼ�ģ������ĳ���-1Ϊֹ��
 * �﷨��
 *  ��������[];
 * ��ʼ����ʽ��
 *  1 ��̬��ʼ�������������ͬʱ���г�ʼ����
 * 	  ��������[]  �������� = new ��������[]{};
 *   ����������[] �������� = {};  
 *  2 ��̬��ʼ����
 *   (1) ��������[] �������� = new ��������[�����С];
 *   (2) ��ֵ����������[����] = ֵ��
 * ����ȡֵ��
 *   ��������[����]  
 * ���鳤�ȣ��;�����õ�����û��ϵ��ֻ�ǳ�ʼ���ռ�Ĵ�С
 *   ��������.length
 * ѭ��ȡֵ��
 *    for(�����ĳ�ʼ������������<���鳤�ȣ���������){
 *    	ʹ��������[����]�������е����ݽ��д���
 *    }
 * forEachѭ������0����λ�ÿ�ʼ���������鳤��-1��
 *    for(�������� ����:�����������ϣ�){   
 *    	�Ա������в���
 *    }
 */
public class TestArray {
	public static void main(String[] args) {
		int[] ages;
		ages = new int[4];
		int age = 18;
		for(int i= 0;i<ages.length;i++){
			ages[i] = age++;
		}
		//forEachѭ��,�������飬��ӡ
		for(int j:ages){
			System.out.println(j);
		}
		User[] users= new User[4];
		for(int i=0;i<users.length;i++){
			User u = new User();
			u.setName("users"+i);
			u.setAge(age+i);
			users[i]=u;
			System.out.println(u);
		}
		System.out.println("===========");
		//forѭ��������ӡ
		for(int i=0;i<users.length;i++){
			System.out.println(users[i]);
		}
		
		
		
		
		/*
		//��̬��ʼ��
		int[] ages = new int[]{20,34,25};
		String[] names ={"����","����","����"};
		//��̬��ʼ��һ
		double [] prices = new double[4];
		prices[0] = 1.3;
		prices[1] = 2.3;
		prices[2] = 3.2;
		prices[3] = 5.3;
		
		//��̬��ʼ��һ
		User[] users = new User[3];
		User u1 = new User();
		u1.setName("������");
		u1.setAge(18);
		User u2 = new User();
		u2.setName("��î");
		u2.setAge(20);
		User u3 = new User();
		u3.setName("����");
		u3.setAge(26);
		users[0] = u1;
		users[1] = u2 ;
		users[2] = u3;
		
		//��̬��ʼ����
		int[] num;
		num = new int[4];
		//����ȡֵ
		System.out.println(ages[2]);
		User u4 = users[2];
		System.out.println("�������˵���ϸ��Ϣ"+u4);  //�Զ�����toString();
		//ʹ��ѭ��ȥ����Ԫ��
		for(int i=0;i<prices.length;i++){
			System.out.println(prices[i]);
		
		}
		*/
		
		
	}
}
