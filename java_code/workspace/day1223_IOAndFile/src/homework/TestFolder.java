package homework;

import java.io.File;

/*
 * 2. 将一个包含多级文件系统文件夹删除
 * 删除指定目录：
 *   1 判断文件是否存在
 *   2 是目录类型还是文件类型：为目录类型则继续，否则直接删除
 *   3 列出该目录下所有的File列表   
 *   4 对File列表进行操作：为目录类型则继续2，否则直接删除
 */
public class TestFolder {

	public static void main(String[] args) {
		File file = new File("d:\\test1");
		fun(file);
		if(file.exists()){
			System.out.println("删除失败");
		}
		else{
			System.out.println("删除成功");
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
