package study;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class SearchMap {

	public static void main(String[] args) {
		int[][] arr = new int[][] { { 1, 4, 7, 8 }, { 2, 6, 3, 9, 1 },
				{ 3, 7, 2, 9, 1, 6 } };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				int c = arr[i][j];
				if (map.containsKey(c)) {
					int count = map.get(c);
					map.put(c, ++count);
				} else {
					map.put(c, 1);
				}
			}
		}
		Set<Entry<Integer, Integer>> set = map.entrySet();
		Iterator<Entry<Integer, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Entry<Integer, Integer> entry = it.next();
			System.out.print(entry.getKey() + "=");
			System.out.print(entry.getValue() + "  ");
		}
	}

}
