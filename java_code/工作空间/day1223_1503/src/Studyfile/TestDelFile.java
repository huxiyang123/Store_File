package Studyfile;


import java.io.File;
/*
 * ɾ���ļ���
 *  1 ָ���ļ��Ƿ����*   
 *  2 ������ɾ��
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