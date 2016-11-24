package study;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ������ʽ��һ�ָ�ʽ�����ַ�������������ƥ�䣬���ҵ��ַ���������
 * 	ʹ�ò��裺
 *   	1 ʹ��Pattern����б��룬������������ʽ����ΪPattern����
 *   	 Pattern p = Pattern.compile��������ʽ�ַ�����
 *   	2 ������Ҫ��ƥ���Ŀ���ַ�����ʹ��Pattern�����matcher��Ŀ���ַ�����
 *   	3 ���رȽϵĽ����
 *   		1���Ƿ�ȫ��ƥ�䣬matches()���Խ�������
 *   ���ʣ�1 X?-?ǰ���ַ�����һ�λ�һ��Ҳû��
 *  	 2 X*-*��ǰ����ַ�������λ���
 *  	 3 X+---+ǰ����ַ�һ�λ���
 *  	 4 X{n}-���ó���n��
 *  	 5 X{n��}-���ٳ���n�Ρ�
 *  	 6 X{n,m}-����n�Σ�����m��
 *   
 */
public class TestRegular {

	public static void main(String[] args) {
		//����a*bΪPattern����
		Pattern p = Pattern.compile("a*b");//*��ǰ����ַ�������λ���
		//���������Ŀ���ַ�����ƥ��
		Matcher m = p.matcher("aaaab");
		//����ƥ��Ľ��
		boolean b = m.matches();
		System.out.println(b);
		
		//����a��bΪPattern����
		Pattern p1 = Pattern.compile("a?b");//?ǰ���ַ�����һ�λ�һ��Ҳû��
		Matcher m1 = p1.matcher("ab");
		//����ƥ��Ľ��
		boolean b1 = m1.matches();
		System.out.println(b1);
	}

}
