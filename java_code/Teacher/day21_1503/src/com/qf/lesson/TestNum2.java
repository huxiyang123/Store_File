package com.qf.lesson;

import java.util.HashMap;
import java.util.Map;

public class TestNum2 {

	public static void main(String[] args) {
		int[][] tt= {{1,4,7,8},{2,6,3,9,1},{3,7,2,9,1,6}};
        System.out.println(getNum(tt));
	}
	
	public static Map<Integer,Integer> getNum(int[][] ts){
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<ts.length;i++){
			for(int j=0;j<ts[i].length;j++){
				int k = ts[i][j];
				if(map.containsKey(k)){
					int count = map.get(k);				
					map.put(k, ++count);
				}
				else{
					map.put(k, 1);
				}
			}
		}
		return map;
	}

}
