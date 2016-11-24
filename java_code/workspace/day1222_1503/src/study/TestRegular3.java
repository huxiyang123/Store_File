package study;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegular3 {

	public static void main(String[] args) {
		String str = "javadsgjava sfjasvafflhskffjavakfsjavajavagfhjavak";
		Pattern p = Pattern.compile("java");
		Matcher m = p.matcher(str);
		int x = 0;
		while(m.find()){
			x++;
		}
		System.out.println(x);
	}

}
