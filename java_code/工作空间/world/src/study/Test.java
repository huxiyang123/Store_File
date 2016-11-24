package study;

public class Test {
/*
 * ��װ�ࣺ�����������͵���������һ�ֱ�ʾ��ʽ��
 * 	ͨ�����ð�װ���MAX_VALUE���Ժ�MIN_VALUE���Ի�ȡ�����ͱ�ʾ�����ݷ�Χ��
 * 	1  ������
 *		byte---java.lang.Byte
 *    	short---java.lang.Short
 *    	int---java.lang.Integer
 *    	long---java.lang.Long
 *  2  �����ͣ�
 * 		---java.lang.Float
 *  	double---java.lang.Double
 *  	isNaN():��װ��Ķ�����һ�������֣�NaN��ֵ���򷵻�true�����򷵻�false��
 *  3  �ַ���
 *  	char---java.lang.Char
 *  4  ��������
 *  	booleang---java.lang.Boolean
 *  	�Զ�װ�䣺�����������͵�ֵ����ֱ�Ӹ�����Ӧ��װ��ı�����jvm�ڱ���ʱ�Զ��ѻ�����������ת��Ϊ��װ��Ķ���
 *  	�Զ����䣺��װ��Ķ������ֱ�Ӹ��������������͵ı�����
 */
	public static void main(String[] args) {
		//������������ת��Ϊ��װ��
		Integer i = new Integer(-23);
		int r  = i.intValue();
		System.out.println(r);
		
		Double d = new Double(0.34);
		boolean b = d.isNaN();
		
		
		System.out.println(b);
		
		Double d1 = d.doubleValue();
		System.out.println(d1+"    v[[[[[[[[[[");
		
		Double d2 = new Double("12345");
		boolean b1 = d2.isNaN();
		System.out.println(b1);
		
		Character c = new Character('a');
		char t = c.charValue();
		System.out.println(t);
		
		Boolean m = new Boolean(true);
		boolean b2 = m.booleanValue();
		System.out.println(b2);
		
		Boolean n = new Boolean("sdf");
		boolean b3 = n.booleanValue();
		System.out.println(b3);
		
		
		
		
		
	}
}
