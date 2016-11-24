package Studyfile;

import java.io.File;
import java.io.IOException;

/*
 * File���ļ���Ŀ¼·�����ĳ����ʾ��ʽ��
 *   ����·���������̷����ļ�·��
 *   ���·�������������ļ���·����Eclipse�в�����Ŀ�ĸ�Ŀ¼��
 *   ���ԣ�
 *     separator:�ָ�������ƽ̨�ķָ������ԣ�window:\,unix:/ 
          ���췽����
       File(String pathName):���ݸ�����path����File����
         ������
      1 exists():�ļ���·���Ƿ����
      2 createNewFile():�������ļ�
      3 delete()��ɾ���˳���·������ʾ���ļ���Ŀ¼��
                       �����·������ʾһ��Ŀ¼�����Ŀ¼����Ϊ�ղ���ɾ����
      4 getAbosultePath():�ļ��ľ���·��
      5 getName():�ļ���·������
      6 isDirectory():�ļ������Ƿ�ΪĿ¼
      7 isFile():�Ƿ�Ϊ�ļ�
      8 length:�ļ��ĳ��ȣ����ֽڱ�ʾ
      9 listFiles():���ظ�·�������е��ļ�
      10 listFiles(FilenameFilter filter):����ָ���Ĺ����������ط���Ҫ���File��������
      11 mkdir():����ָ��Ŀ¼
      12 mkdirs():�������в㼶Ŀ¼
      13 renameTo(File file):�ļ�������
    FilenameFilter�ࣺ
        accept(): ����ָ���Ĺ�����������boolean�����true�򷵻أ�������˵���
 */
public class TestFile {

	public static void main(String[] args) {
		//�ļ�����
		File file = new File("e:"+File.separator+"temp1.txt");
        boolean canRead = file.canRead();
        System.out.println(canRead);
        
        //�ļ��Ƿ����
        boolean isExist = file.exists();
        if(!isExist){
        	boolean isSuccess = false;
        	try {
				 isSuccess = file.createNewFile();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
        	if(isSuccess){
        		System.out.println("����"+file.getName()+"�ɹ�!!!");
        	}
        	else{
        		System.out.println("����ʧ��");
        	}
        }
        
        System.out.println("����·���� "+file.getAbsolutePath());
        System.out.println("·���� "+file.getPath());
        
        boolean isRenamSuccess = file.renameTo(new File("e:"+File.separator+"temp2.txt"));
        System.out.println(isRenamSuccess);
        System.out.println(file.length());
	}

}
