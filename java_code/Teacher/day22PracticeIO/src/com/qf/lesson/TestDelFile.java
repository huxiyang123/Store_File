package com.qf.lesson;

import java.io.File;
/*
 * 删除文件：
 *  1 指定文件是否存在*   
 *  2 存在则删除
 */
public class TestDelFile {

	public static void main(String[] args) {
		File file = new File("test.txt");
        if(file.exists()){
        	boolean isSuccess = file.delete();
        	if(isSuccess){
        		System.out.println("delete success");
        	}
        	else{
        		System.out.println("delete failure!!");
        	}
        }
	}

}
