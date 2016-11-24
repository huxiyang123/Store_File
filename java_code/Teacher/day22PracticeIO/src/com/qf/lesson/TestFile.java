package com.qf.lesson;

import java.io.File;
import java.io.IOException;

/*
 * File：文件和目录路径名的抽象表示形式。
 *   绝对路径：包含盘符的文件路径
 *   相对路径：参照其他文件的路径。Eclipse中参照项目的根目录。
 *   属性：
 *     separator:分隔符。跨平台的分隔符属性，window:\,unix:/ 
          构造方法：
       File(String pathName):根据给定的path创建File对象
         方法：
      1 exists():文件或路径是否存在
      2 createNewFile():创建新文件
      3 delete()：删除此抽象路径名表示的文件或目录。
                       如果此路径名表示一个目录，则该目录必须为空才能删除。
      4 getAbosultePath():文件的绝对路径
      5 getName():文件或路径名称
      6 isDirectory():文件对象是否为目录
      7 isFile():是否为文件
      8 length:文件的长度，以字节表示
      9 listFiles():返回该路径下所有的文件
      10 listFiles(FilenameFilter filter):根据指定的过滤条件返回符合要求的File对象数组
      11 mkdir():创建指定目录
      12 mkdirs():创建所有层级目录
      13 renameTo(File file):文件重命名
    FilenameFilter类：
        accept(): 根据指定的过滤条件返回boolean结果，true则返回，否则过滤掉。
 */
public class TestFile {

	public static void main(String[] args) {
		//文件测试
		File file = new File("e:"+File.separator+"temp1.txt");
        boolean canRead = file.canRead();
        System.out.println(canRead);
        
        //文件是否存在
        boolean isExist = file.exists();
        if(!isExist){
        	boolean isSuccess = false;
        	try {
				 isSuccess = file.createNewFile();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
        	if(isSuccess){
        		System.out.println("创建"+file.getName()+"成功!!!");
        	}
        	else{
        		System.out.println("创建失败");
        	}
        }
        
        System.out.println("绝对路径： "+file.getAbsolutePath());
        System.out.println("路径： "+file.getPath());
        
        boolean isRenamSuccess = file.renameTo(new File("e:"+File.separator+"temp2.txt"));
        System.out.println(isRenamSuccess);
        System.out.println(file.length());
	}

}
