package study;
/*
 * String
 * 	�ص㣺
 * 		1   ��final�࣬���ܱ��̳С�
 * 		2   һ�����������ԹŴ�������ֵ���ɸı䡣
 *  	3 �ַ�������ֵ��һ��String���󣬱�������ַ�������child���ڴ��������Ҳ����ظ�
 *  	4 �����ַ���������ʱ�����Ȼ�ȥ�������в��ң��Ƿ����ظ�������ֵ����û�е�����¾ͻᴴ��
 *  	5  ����=�� �ұ��б�����newһ������ʱ��Ҳ���ڶ���������һ������
 * 	�ַ�������أ������أ���
 * 		
 */
public class TestString {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = "abc";				//ֱ�Ӱѡ�abc������ĵ�ַ����s2
		System.out.println(s1==s2);
		//����equals�Ƚ�s1��s2�����Ƿ����
		System.out.println("s1��s2�������"+s1.equals(s2));
		
		String s3 = "ab"+"c";
		System.out.println("=========");
		System.out.println(s2==s3);
		String s5 = s3+5;
		String s4 = new String(s3+5);
		System.out.println(s4==s5);
		/*
		 * charAt(int index):����ָ����������charֵ
		 * compareTo(String otherStr):
		 * concat(String str):
		 * 
		 */
		System.out.println("========����");
		String str = "abc";		
		int len1 = str.length();
		int len2 = "abc".length();
		System.out.println(len1+","+len2);
		System.out.println("char a index:"+str.charAt(2));
		System.out.println(str.charAt(1));
		System.out.println(str.codePointAt(2)+"   ............");
		
		int str1 = str.compareTo("afb");
				System.out.println(str1+"    ----------");
				System.out.println(str.compareTo("ab"));
		System.out.println("abd".concat(str));
				System.out.println("abc".contains("ab"));
				
		System.out.println("abc".equals(str));
		System.out.println("abc".equalsIgnoreCase("Abc"));
		byte[] bs = "abc".getBytes();
		for(byte b:bs){
			System.out.print(b+"  ");
		}
		System.out.println("================");
		System.out.println("abcdefg".indexOf('a'));
		System.out.println("abcdefg".indexOf("cde"));
		
		int lastIndex = "abcdabdcd".lastIndexOf('d');//���һ�γ��ֵ�����
		System.out.println(lastIndex);
		
		String[] result = "�ν�,����,�ֳ�,�˸�,����,����,����,���,ʷ��,���".split(",");
		for(String  g:result){
			System.out.print(g+" ");
		}
		System.out.println("abcdabdcd".substring(4, 7));
	}

}
