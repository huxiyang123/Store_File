package Design;
/*
 * ģʽ�������д����һЩ�õķ�����ʵ��
 *   ���ࣺ���е�����
 *    1 ����ģʽ��ʵ�ָ�ģʽ����ֻ����һ������
 *     ���裺
 *       1) ���췽��˽�л���Ŀ���Ƿ�ֹ���ⲿ��������
 *       2) ����˽�е���������Ѵ����Ķ��󸳸��ñ���
 *       3) �������е�static��������Ϊ�����͵ķ��������ز���2)�������������(ֻ��static���͵ķ�������ͨ����������)
 *       4) ����2)������������޸�Ϊstatic(�Ա�static����ʹ��)
 *     ���ݴ��������ʱ����ͬ����Ϊ����ģʽ�ͱ���ģʽ��
 *       1) ����ģʽ�������������ͱ�����ͬ�½��ж���Ĵ�����
 *       2) ����ģʽ�����õ�ʱ������жϣ����������ֱ�ӷ��أ�����ſ�ʼ����Ĵ�����   
 */ 
//����ģʽ
public class Design {
	private static Design instance = new Design();
	private Design(){
		System.out.println("����Design��˽�й��췽����");
	}
	
	public static Design getInstance(){
		return instance;
	}
	void display(){
		System.out.println("Design");
	}
}