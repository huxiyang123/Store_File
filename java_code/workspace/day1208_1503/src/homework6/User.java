package homework6;
/*
  6.����һ������public,private,protected,
 	��Ĭ�Ϸ���Ȩ���ֶ��Լ�������Ա����. 
 	���������һ������,��������ͼ�����������Աʱ,
 	��õ�ʲô���͵ı�����Ϣ,
 	��ע��,����ͬһ��Ŀ¼�е����е��඼��ȱʡ����һ����.
 */
public class User {
	String name;
	private int password;
	public void say(){
		System.out.println(name+"˵���й����꣡����");
	}
	protected void fun(){
		System.out.println("���㵺���й��ģ�");
	}
}
