package study;
/*
 *�Զ����쳣��
 *	�����������쳣�಻����ҵ��Ҫ��
 *	�﷨��
 *		�쳣���� extends Exception(����){
 *		
 *		}
 *	ͨ������ڸ���Ĺ��췽��ʵ���Զ�����ĸ��ֹ��췽��.
 *	�Զ����쳣
 *	ʵ����
 *	  4 catch�����쳣ʱ�򣬳��˱�Ҫ����ʾ��Ϣ�⣬���
 */
public class CustomException extends Exception{
	public CustomException(String msg){
		super(msg);
	}
	public void dispalyError(){
		System.out.println("haohoahoaoahahaho");
	}
}
