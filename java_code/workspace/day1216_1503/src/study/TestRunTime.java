package study;

import java.io.IOException;


/*
 * RunTime  java 运行时环境
 * 		getRuntime();
 * 		exec(String st);
 * 
 */
public class TestRunTime {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		try {
			rt.exec("calc.exe");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		//System.out.println(new Date());
	}
}
