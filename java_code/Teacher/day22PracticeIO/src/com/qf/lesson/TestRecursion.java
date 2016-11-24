package com.qf.lesson;

import java.io.File;
/*
 * 递归指定目录下所有的File对象：
 *  
 */
public class TestRecursion {

	public static void main(String[] args) {
		File file = new File("e:\\temp");
		display(file);

	}
    /*
     * new FilenameFilter() {

				@Override
				public boolean accept(File dir, String name) {
					boolean flag = name.endsWith(".java")||(dir.isDirectory()&&!name.endsWith(".txt"));
					return flag;
				}
			}
     */
	public static void display(File file) {
		if (file.isFile()) {
			//打印文件名
			//System.out.println(file.getName());
		} else {
			//目录的话打印目录名
			System.out.println(file.getName());
			File[] files = file.listFiles();
			for (File f : files) {
				if (f.isDirectory()) {
					display(f);
				} else {
					//打印文件名
					//System.out.println(f.getName());
				}
			}
		}
	}

}
