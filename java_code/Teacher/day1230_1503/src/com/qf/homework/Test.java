package com.qf.homework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 步骤：
 *   1 读取文件中相关信息，放在Map集合结构。使用split分隔字符为字符串数组
 *   2 使用Scanner获取年份
 *   3 根据年份输出举办国和冠军国信息
 */
public class Test {

	public static void main(String[] args) {
		Map<String, CountryInfo> map = new HashMap<>();
		try {
			InputStream is = new FileInputStream("message.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String temp = null;
			// 跨越第一行
			br.readLine();
			
			while ((temp = br.readLine()) != null) {
				String[] ts = temp.split("   ");
				map.put(ts[0], new CountryInfo(ts[1], ts[2]));
			}
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

		Scanner  scan = new Scanner(System.in);
		System.out.println("请输入年份");
		boolean flag = true;
		while(flag){
			String year = scan.next();
			if(map.containsKey(year)){
				System.out.println(map.get(year));
			}
			else if(year.equals("exit")){
				flag = false;
				System.exit(1);
			}
			else{
				System.out.println("输入年份有误！！！");
			}
		}
	}

}
