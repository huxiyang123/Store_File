package study;
/*
 * StringBuffer���ַ��������ࡣ���ȿɱ�
 * 	ԭ����ΪString�ǲ��ɱ�ģ�����µ��ַ���������µĶ��󣬺÷��ڴ�
 * 	���췽����StringBuffer�����ַ�����СΪ16���ַ����Ļ�����
 * 	������ 
 * 		1 append��String atr����
 * 		2 capacity();
 * 		3 insert(int str1,String str2)
 * 		4 length�������������ĳ���
 */
public class TestStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" world");
		
		int i = 19;
		String str = String.valueOf(i); 	//��int�͵�iת��ΪString����
		System.out.println(sb.insert(5, str));
	
		sb.insert(5, "  China");	//��  China���5 λ�����sb�ڴ���
	
		System.out.println(sb);//�˴�ʡ��.toString()��
		System.out.println(sb.length());
	}
}
