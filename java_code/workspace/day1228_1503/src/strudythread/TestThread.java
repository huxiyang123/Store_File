package strudythread;
/*
 * ����ʹ���ض����Ա�д�ģ�ʵ���ص㹦�ܵĴ��룬�Ǿ�̬�ġ�
 * ���̣������еĳ��򣬲���ϵͳ��������ڴ棬�������������������̬�ġ�
 * �̣߳����̵�һ������ִ�з�֧�����Ρ�
 * 	ʹ�ö��߳�ԭ��
 * 		1 �����������顣
 * 		2 һ�������еĶ���߳̿��Խ����ڴ�(�������е����ݵ���Դ)�Ĺ���
 * ע�⣺
 * 	  JVM����main�����ǣ����Զ�����һ��main�̡߳�
 * �������̵߳ķ�ʽ��
 * 	  1 �̳�Thread�࣬
 * 		1��extends  Thread��
 * 		2�����า��run��������,��д���ܴ���
 * 		3����������Ķ���
 * 		4) ����start��������
 * ���췽����
 * 	Thread����
 * ������
 * 	currentThread��������������ִ�е��̵߳����á�
 * 	run�������Ǹ��߳̿�ʼִ�С��̻߳��CPUִ��Ȩ��start()���Զ�����
 * 	start() ʹ���߳̿�ʼִ�У�Java ��������ø��̵߳� run ������
 *2 ʵ��Runnable�ӿڣ�
 *	���裺
 *		1 ����implements Runnable
 *		2 ���า��run��������д���ܴ���
 *	  	3 �����������
 *		4 ����Thread���󣬲���3 �Ķ�����Ϊ��������������
 *		5����Thread�����start������start�������Զ����ò���1�ж�����̷���
 *�̳�Thread��ʵ��Runnable������
 *	1 Java�ǵ��̳У����Լ̳�Thread����޷��̳������ࡣ����Runnable����ʵ�ֶ�̳�
 *	2 �̳�Thread�߳��޷����ó�Ա����������ʹ��static����Ϊ������ſ��Թ�����ʵ��Runnable�ӿڿ��Թ����Ա����
 *	3 Threadʵ�ֱȽϼ򵥣�Runnable�ӿ��Ը���Щ��
 */
public class TestThread {

	public static void main(String[] args) {
		NumThread nt = new NumThread();
		nt.setName("���߳�1 :  ");
		nt.start();
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+i);
		}
	}

}
