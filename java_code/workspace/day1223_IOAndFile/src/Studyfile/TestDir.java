package Studyfile;

import java.io.File;
/*
 * 删除指定目录：
 *   1 判断文件是否存在
 *   2 是目录类型还是文件类型：为目录类型则继续，否则直接删除
 *   3 列出该目录下所有的File列表   
 *   4 对File列表进行操作：为目录类型则继续2，否则直接删除
 */
public class TestDir {

	public static void main(String[] args) {
		File file = new File("e:\\test.txt");
        if(file.exists()){
        	//是否是目录
        	if(file.isDirectory()){
        		File[] files = file.listFiles();
        		for(File f:files){
        			if(f.isFile()){
        				boolean isSuccess = f.delete();
        	        	if(isSuccess){
        	        		System.out.println("delet成功");
        	        	}
        	        	else{
        	        		System.out.println("失败!!!");
        	        	}
        			}
        			else{
        				//目录的话则又开始
        			}
        		}
        		file.delete();
        	}
        	else{//文件直接删除
        		boolean isSuccess = file.delete();
	        	if(isSuccess){
	        		System.out.println("delet成功");
	        	}
	        	else{
	        		System.out.println("失败!!!");
	        	}
        	}
        	
        }
	}	


}