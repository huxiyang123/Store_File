package study;
/*
 * StingBuilder:��StringBuffer��ͬ��
 * ���췽����StringBuiler�����ַ�����СΪ16���ַ����Ļ�����
 * 	������ 
 * 		1 append��String atr����
 * 		2 capacity();
 * 		3 insert(int str1,String str2)
 * 		4 length�������������ĳ���
 */
public class TestStingBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.append(" world");
		sb.insert(5, "  China");	//��  China���5 λ�����sb�ڴ���
	
		System.out.println(sb);//�˴�ʡ��.toString()��
		System.out.println(sb.delete(9, 13));	//10Ϊ��12λ�Ķ�ɾ��
	}

}
