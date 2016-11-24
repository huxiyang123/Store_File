package com.qf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 实际应用：
 *   例如电子邮件： \w+@\w+[.]\w+
 *   身份证： ^\d{15}|\d{18}$
 */
public class TestReg3 {

	public static void main(String[] args) {
		Pattern  p = Pattern.compile("\\w+@\\w+[.]\\w+");
        Matcher m = p.matcher("test@h.com");
        System.out.println(m.matches());
        
        Pattern  p1 = Pattern.compile("^\\d{15}|\\d{17}[0-9X]$");
        System.out.println(p1.matcher("123456789123456538").matches());
	}

}
