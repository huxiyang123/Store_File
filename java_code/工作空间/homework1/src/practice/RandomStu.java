package practice;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
//����ǿ��24����ҵ���ο�
public class RandomStu {

	public static void main(String[] args) {
		getRandom(getNames(new File("E:" + File.separator + "��ҵ" + File.separator
				+ "Android1503����.txt")));
		
	}
	
	public static String getNames(File f){
		BufferedReader br = null;
		String temp = null;
		StringBuffer names = new StringBuffer("");
		try {
			Reader r = new FileReader(f);
			br = new BufferedReader(r);

			while ((temp = br.readLine()) != null) {
				 names.append(temp);
			}
		} catch (FileNotFoundException e) {
			System.out.println("file is not found!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("file read fail!");
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return names.toString();
	}
	
	public static void getRandom(String names){
		
		String[] str = names.split(",");
		int num = (int) (Math.random() * str.length);
		System.out.println(str[num]);	
	}
}
