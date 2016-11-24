package study;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/*
 * 指定字符串中字符的出现次数
 */
public class PracticeHashMap {

	public static void main(String[] args) {
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		String s = "ajegfiuwrenxljvjnfeijkfnlj";
		int len = s.length();
		for(int i=0;i<len;i++){
			char c = s.charAt(i);
			if(map.containsKey(c)){
				int count = map.get(c);
				map.put(c, ++count);
			}
			else{
				map.put(c, 1);
			}
		}
		
		Set<Entry<Character, Integer>> set = map.entrySet();
		Iterator<Entry<Character, Integer>> it = set.iterator();
		while(it.hasNext()){
			Entry<Character, Integer> entry =it.next();
			System.out.print(entry.getKey()+"=");
			System.out.print(entry.getValue()+" ");
		}
		System.out.println();
		System.out.print(map+"  ");
	}

}
