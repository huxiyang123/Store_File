package study;

import java.io.IOException;


/*
 * RunTime  java ����ʱ����
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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		//System.out.println(new Date());
	}
}
