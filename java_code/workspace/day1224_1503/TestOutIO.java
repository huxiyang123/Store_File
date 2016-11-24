package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestOutIO {

	public static void main(String[] args) {
		/*
		 * ����һ���ļ�
		 */
		File file =new File("2.txt");
		boolean isExist = file.exists();
		//�ж��ļ��Ƿ���ڵ�������ִ��if
        if(!isExist){
        	boolean isSuccess = false;
        	try {
				 isSuccess = file.createNewFile();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
        	//�ж��ļ������Ƿ�ɹ�
        	if(isSuccess){
        		System.out.println("����"+file.getName()+"�ɹ�!!!");
        	}
        	else{
        		System.out.println("����ʧ��");
        	}
        }
        
 //���ļ���д��һЩ����    
        OutputStream os =null;
		try {
			//true�ǿ��Զ��д�������Ҳ�����
			os = new FileOutputStream("2.txt",true);
			//����my��������huxiyang��ת��Ϊbyte����
			byte[] sa = "my name is huxiyang   ".getBytes();
			//д��
			os.write(sa,0,sa.length);
			//���ÿ��д������ڴ��е�ռ�õ��ڴ�
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally{
			try {
				//�ر���
				os.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
//�����ļ�����
        InputStream is=null;
		try {
			is = new FileInputStream("2.txt");
			byte[] bs = new byte[512];
			int len = 0;
			while((len=is.read(bs))!=-1){
				String str = new String(bs);
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}					
	}

}
