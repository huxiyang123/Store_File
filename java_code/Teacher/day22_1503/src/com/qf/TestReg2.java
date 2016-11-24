package com.qf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestReg2 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[abcde]");
        Matcher m = p.matcher("a");
        System.out.println(m.matches());
        
        Pattern p2 = Pattern.compile("[^abcde]");
        Matcher m2 = p2.matcher("f");
        System.out.println(m2.matches());
        
        Pattern p3 = Pattern.compile("[a-zA-Z]");
        Matcher m3 = p3.matcher("F");
        System.out.println(m3.matches());
        
        Pattern p4 = Pattern.compile("\\d");//[0-9]
        Matcher m4 = p4.matcher("0");
        System.out.println(m4.matches());
	}

}
