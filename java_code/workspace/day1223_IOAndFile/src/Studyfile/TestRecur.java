package Studyfile;

import java.io.File;

public class TestRecur {

	public static void main(String[] args) {
		File file = new File("d:\\test");
		display(file);
	}

	public static void display(File file) {
		if (!file.isFile()) {
			System.out.println(file.getName());//打印根目录
			// 打出某一目录下的所有文件（不打印目录）
			File[] files = file.listFiles();
			for (File f : files) {
				if (f.isDirectory()) {
					display(f);
				} else {
					System.out.println(f.getName());
				}
			}
		}
		else{
			System.out.println(file.getName());
		}
	}
}
