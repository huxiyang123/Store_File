package study;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ʵ��Ӧ��:
 * 	��������ʼ���\w+@\w+[.]\w+
 *  ���֤��\D{15}|\D{18}$
 */
public class TestRegular1 {

	public static void main(String[] args) {
		Pattern p1 = Pattern.compile("\\w+@\\w+[.]\\w+");
		Matcher m1 = p1.matcher("361832494@qq.com");
		System.out.println(m1.matches());

		Pattern p2 = Pattern.compile("^\\d{15}|^\\d{18}$");
		Matcher m2 = p2.matcher("12345678912345678");
		System.out.println(m2.matches());
	}

}
