package homework;
/*
 * 1 ����һ��HashMap��������������м���5������ֵ�ԡ��������HashMap����
 * ��ӡ�����еļ���ֵ�ԣ�
 * ���Ƚϼ���ļ���ֵ��˳��ʹ�ӡ���ļ���ֵ�Ե�˳���Ƿ���ͬ
 */
import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap1 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("zhangsan", 20);
		map.put("lisi", 21);
		map.put("wangwu", 19);
		map.put("maliu",25);
		map.put("zhaoqi", 23);
		//System.out.println(map);
		//������ӡ
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println("===========================================");
		
		Set<String> set1 = map.keySet();	
		Iterator<String> it1 = set1.iterator();
		while(it1.hasNext()){
			
			System.out.print(it1.next()+" ");
		}

	}

}
