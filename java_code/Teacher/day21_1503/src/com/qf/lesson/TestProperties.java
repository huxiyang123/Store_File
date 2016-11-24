package com.qf.lesson;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/*
 * Properties的使用：
 *    表示了一个持久的属性集。Properties 可保存在流中或从流中加载。
 *    属性列表中每个键及其对应值都是一个字符串。
 * 构造方法：
 *   Properties()：  创建一个无默认值的空属性列表。 
 * 方法：
 *   1 load(InputStream inStream)： 从输入流中读取属性列表（键和元素对）。
 *   2 getProperty(String key)：  用指定的键在此属性列表中搜索属性。
 *   3 setProperty(String key, String value)： 调用 Hashtable 的方法 put。（了解）
 * 使用场景：
 *   系统配置文件中，实现配置的动态修改。主要用于配置信息的读取。
 */
public class TestProperties {

	public static void main(String[] args) {
		Properties ps = new Properties();
		try {
			//以文件流的方式加载配置文件
			ps.load(TestProperties.class.getResourceAsStream("db.properties"));
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
        //获取对应属性的值
		String uname = ps.getProperty("username");
		String pw = ps.getProperty("password");
		System.out.println(uname + " ;" + pw);
		//设置对应属性的值
		ps.setProperty("username", "hellworld");
		//设置新的属性
		ps.setProperty("test", "test");
		try {
			//新的属性值进行保存
			OutputStream os = new FileOutputStream("/db.properties");
			ps.store(os,"");
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
