package com.qf.lesson;

import java.util.HashMap;
import java.util.Map;

/*
 * 指定字符串中字符的出现次数
 */
public class TestNum {

	public static void main(String[] args) {
		System.out.println(getNum("afasdfasdfsdakjfalhkjgklagsa"));

	}
	
	public static Map<Character,Integer> getNum(String s){
		int len = s.length();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<len;i++){
			char c = s.charAt(i);//获取索引处字符			
			if(map.containsKey(c)){
				int count = map.get(c);
				count++;
				map.put(c, count);
			}
			else{
				map.put(c, 1);
			}
		}		
		return map;
	}

}
