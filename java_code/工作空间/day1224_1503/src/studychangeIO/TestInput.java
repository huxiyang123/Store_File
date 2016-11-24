package studychangeIO;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * 转换流：
 * 	1 输入转换：InputStreamReader:字节流转化为字符流的桥梁
 * 	   构造方法：
 * 		InputStreamReader():创建使用给定字符集的InputStreamReader。
 * 	   方法：
 * 		read():读取单个字节
 * 		read(char[] cbuf, int offset, int length) 将字符读入数组中的某一部分
 * 		close() 关闭该流并释放与之关联的所有资源。
 */
public class TestInput {

	public static void main(String[] args) {
		//输入流对象
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		System.out.println("请输入：");
		try {
			int len = 0;
			char[] c = new char[1024];
			
			while((len = isr.read(c))!=-1){
				String str = new String(c,0,len);
				System.out.println("键盘输入的是："+str);
			}			
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {				
					isr.close();
					is.close();
	
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

}
