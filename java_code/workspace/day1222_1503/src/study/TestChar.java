package study;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestChar {

	public static void main(String[] args) {
		Pattern p1 = Pattern.compile("[abcde]{3}");
		Matcher m1 = p1.matcher("abe");
		System.out.println(m1.matches());
		
		Pattern p2 = Pattern.compile("[^abcde]");
		Matcher m2 = p2.matcher("f");
		System.out.println(m2.matches());
		
		Pattern p3 = Pattern.compile("[a-zA-Z]");//任意一个
		Matcher m3 = p3.matcher("f");
		System.out.println(m3.matches());
		
		
 
	}

}
