package homework1;
/*
 * 1  ����һ������ʮ�����������飬��д����ʵ�������ȡ�����е���������ӡ������
 */
public class TestRandom {
	public static void main(String[] args) {
		String[] name = new String[]{"�ν�","����","�ֳ�","�˸�","����","����","����","���","ʷ��","���"};
		int num = (int)(Math.random()*10);
		System.out.println(name[num]);
		
	}
	
}
