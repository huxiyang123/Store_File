package Studyfile;

import java.io.File;
/*
 * ɾ��ָ��Ŀ¼��
 *   1 �ж��ļ��Ƿ����
 *   2 ��Ŀ¼���ͻ����ļ����ͣ�ΪĿ¼���������������ֱ��ɾ��
 *   3 �г���Ŀ¼�����е�File�б�   
 *   4 ��File�б���в�����ΪĿ¼���������2������ֱ��ɾ��
 */
public class TestDir {

	public static void main(String[] args) {
		File file = new File("e:\\test.txt");
        if(file.exists()){
        	//�Ƿ���Ŀ¼
        	if(file.isDirectory()){
        		File[] files = file.listFiles();
        		for(File f:files){
        			if(f.isFile()){
        				boolean isSuccess = f.delete();
        	        	if(isSuccess){
        	        		System.out.println("delet�ɹ�");
        	        	}
        	        	else{
        	        		System.out.println("ʧ��!!!");
        	        	}
        			}
        			else{
        				//Ŀ¼�Ļ����ֿ�ʼ
        			}
        		}
        		file.delete();
        	}
        	else{//�ļ�ֱ��ɾ��
        		boolean isSuccess = file.delete();
	        	if(isSuccess){
	        		System.out.println("delet�ɹ�");
	        	}
	        	else{
	        		System.out.println("ʧ��!!!");
	        	}
        	}
        	
        }
	}	


}