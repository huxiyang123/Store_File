package com.qf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestReg4 {

	public static void main(String[] args) {
		String s = "javaaaafjavabjava7javahjhjavaujavappjava";
        Pattern p = Pattern.compile("java");
        Matcher m = p.matcher(s);
        int num = 0;
        while(m.find()){//局部匹配
        	num++;
        }
        System.out.println(num);
	}

}
