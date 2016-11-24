package study;

import java.util.HashMap;
import java.util.Map;

/*
 * Map:
 *   ʹ�ü�-ֵ�Ա���Ԫ�ء� *  
 *   ͨ��ʹ��String���Ͷ�����Ϊkey��ʹ���Զ�������Ϊkey�Ļ�������븲���Զ������hasCode()��equals()������
 *   
 * ������
 *   1 put(T key,V value):
 *     1)key�����ڣ����key�Ͷ�Ӧ��value�����map�����С�
 *     2)key�Ѵ��ڣ���ʹ���µ�valueֵ�滻�ɵ�valueֵ
 *   2 remove(T key):ɾ��key��Ӧ��key-valueӳ�䡣  *     
 *   3 containsKey(T key):�Ƿ����ָ����key
 *   4 containsValue(V value)���Ƿ����ָ����value
 *   5 keySet():����Ӧ��Set���ϡ�
 *   6 values():ֵ��Ӧ��Collection����
 *   7 entrySet():����Map.Entry��Ӧ�ļ���
 *   8 isEmpty():�����ӳ��δ������-ֵӳ���ϵ���򷵻� true��   
 *  ȡֵ��ʽ��
 *    1 keySet()��get(T key)���ʹ��
 *    2 entrySet()��Map.Entry���ʹ��
 *  
 * ʵ���ࣺ
 *   1 HashMap��
 *    ���췽����
 *     HashMap():Ĭ������16�Ŀ�map���ϡ�
 *     �ײ��keyʹ��HashSet���棬�����ظ���valueʹ��Collection���ͱ��棬�����ظ���
 *   
 *   3 Properties��
 */
public class TestMap {

	public static void main(String[] args) {
		// ʹ��String��key
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("first", 1);
		map.put("second", 2);
		map.put("third", 3);
		map.put("forth", 2);
		map.put("first", 5);

//		System.out.println(map.size());
//		System.out.println(map);

		// ʹ���Զ�������Key
		Map<User, String> uMap = new HashMap<User, String>();
		uMap.put(new User("zhangsan", 18), "zhangsan");
		uMap.put(new User("lisi", 18), "lisi");
		uMap.put(new User("zhangsan", 18), "wangwu");
		System.out.println(uMap.size());
		System.out.println(uMap);
		
		
		
	}

}
