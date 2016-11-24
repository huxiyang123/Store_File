package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestOutIO {

	public static void main(String[] args) {
		/*
		 * 创建一个文件
		 */
		File file =new File("2.txt");
		boolean isExist = file.exists();
		//判断文件是否存在当不存在执行if
        if(!isExist){
        	boolean isSuccess = false;
        	try {
				 isSuccess = file.createNewFile();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
        	//判断文件创建是否成功
        	if(isSuccess){
        		System.out.println("创建"+file.getName()+"成功!!!");
        	}
        	else{
        		System.out.println("创建失败");
        	}
        }
        
 //给文件中写入一些内容    
        OutputStream os =null;
		try {
			//true是可以多次写入内容且不覆盖
			os = new FileOutputStream("2.txt",true);
			//将“my。。。。huxiyang”转换为byte数组
			byte[] sa = "my name is huxiyang   ".getBytes();
			//写入
			os.write(sa,0,sa.length);
			//清空每次写入后在内存中的占用的内存
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			try {
				//关闭流
				os.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
//读出文件内容
        InputStream is=null;
		try {
			is = new FileInputStream("2.txt");
			byte[] bs = new byte[512];
			int len = 0;
			while((len=is.read(bs))!=-1){
				String str = new String(bs);
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}					
	}

}
