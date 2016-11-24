package Studyfile;

import java.io.File;

public class TestRecur {

	public static void main(String[] args) {
		File file = new File("d:\\test");
		display(file);
	}

	public static void display(File file) {
		if (!file.isFile()) {
			System.out.println(file.getName());//��ӡ��Ŀ¼
			// ���ĳһĿ¼�µ������ļ�������ӡĿ¼��
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
