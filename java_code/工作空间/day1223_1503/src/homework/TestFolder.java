package homework;

import java.io.File;

/*
 * 2. ��һ�������༶�ļ�ϵͳ�ļ���ɾ��
 * ɾ��ָ��Ŀ¼��
 *   1 �ж��ļ��Ƿ����
 *   2 ��Ŀ¼���ͻ����ļ����ͣ�ΪĿ¼���������������ֱ��ɾ��
 *   3 �г���Ŀ¼�����е�File�б�   
 *   4 ��File�б���в�����ΪĿ¼���������2������ֱ��ɾ��
 */
public class TestFolder {

	public static void main(String[] args) {
		File file = new File("d:\\test1");
		fun(file);
		if(file.exists()){
			System.out.println("ɾ��ʧ��");
		}
		else{
			System.out.println("ɾ���ɹ�");
		}
	}

	public static void fun(File file) {
		if (file.exists()) {
			
			if (!file.isFile()) {
				File[] fil = file.listFiles();
				
				for (File f : fil) {
					
					if (f.isDirectory()) {
						fun(f);
					} else {
						f.delete();
					}
				}
				
			} else {
				file.delete();
			}
			file.delete();
		}
	
	}
}
