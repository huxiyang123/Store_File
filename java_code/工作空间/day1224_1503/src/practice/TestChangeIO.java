package practice;
/*
 * * 使用转换流，实现在控制台回显显示的内容
 * 	步骤：1根据System.in获取输入字节流
 * 		2使用InputStreamReader转换流转换字节流为字符流
 * 		3获取输入的结果
 * 		4根据System.out获取输出字节流
 * 		5使用OutputStreamWriter转换字符为字节流中的数据
 * 		6调用转换流的write()方法
 * 		7关闭流
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestChangeIO {

	public static void main(String[] args) {
		//输入流对象
				//InputStream is = System.in;
				OutputStream os = System.out;
				InputStreamReader isr = new InputStreamReader(System.in);
				OutputStreamWriter osw = new OutputStreamWriter(os);
				System.out.println("请输入：");
				try {
					int len = 0;
					char[] c = new char[1024];
					
					while((len = isr.read(c))!=-1){
						String str = new String(c,0,len);
					
						 osw.write(str);
						 osw.flush();
					}			
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				finally{
					try {				
					
							osw.close();
							os.close();
//							isr.close();
//							System.in.close();
							
			
					} catch (IOException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
	}

}
