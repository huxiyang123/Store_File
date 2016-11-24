package study;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * SimpleDateFormat 是一个以与语言环境有关的方式来格式化和解析日期的具体类。
 * 			它允许进行格式化（日期 -> 文本）、解析（文本 -> 日期）和规范化。
 * 		format(Date date);
 * 		patse(String str):
 * 
 */
public class TestDateFormat {

	public static void main(String[] args) {
		Date d = new Date();
		//转换
		DateFormat df = new SimpleDateFormat("y年+M月——d日  H:m:s  S");
		System.out.println(df.format(d));
		//解析
		String past = "2015年+12月——16日  18:11:9  793";
		try {
			Date now2 = df.parse(past);
			System.out.println(d.after(now2));
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}

}
