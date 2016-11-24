package study;

import java.util.Date;

/*
 * Date»’∆⁄¿‡
 */
public class TestDate {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		System.out.println(now.toLocaleString());
		long n = System.currentTimeMillis()-24*60*60*1000;
		Date now1 = new Date(n);
		System.out.println(now1.toLocaleString());
		
	}

}
