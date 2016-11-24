package homework;

import java.io.File;

/*
 * 1  �ݹ����ָ���ļ����������ļ���
 */
public class TestRecursion {

	public static void main(String[] args) {
		File file = new File("d:\\test");
		display(file);

	}

	public static void display(File file) {
		if(file.isFile()){
			System.out.println(file.getName());
		}
		else{
			System.out.println(file.getName());
			File[] fi = file.listFiles();
			for(File f:fi){
				if(f.isDirectory()){
					display(f);
				}
				else{
					System.out.println(f.getName());
				}
			}
		}
	}
}
