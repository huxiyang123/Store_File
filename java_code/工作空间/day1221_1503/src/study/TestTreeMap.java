package study;

import java.util.Map;
/*
 * TreeMap:
 *   �ײ�ʹ�ú�ڶ������ṹ��key������������key��Ӧ�������ʵ��Comparable�ӿڡ�
 *   ���򷽷���
 *   1 ��Ȼ����key��Ӧ����ʵ����Comparable�ӿڣ�����֮���ṩ�������㷨���ܽ�������
 *   2 ��������:�ṩComparator�Ƚ���ʵ���࣬��compare()�ж���Ҫ����Ķ������ǿ������
 * ���췽���������������ȼ�������Ȼ����
 *   1 TreeMap():ʹ�ü�����Ȼ˳����һ���µġ��յ���ӳ�䡣
 *   2 TreeMap(Comparator<? super K> comparator):
 *     ����һ���µġ��յ���ӳ�䣬��ӳ����ݸ����Ƚ�����������
 * ע�⣺���key�Ѿ����ڣ�ʹ��put�������������ͬ��keyʱ����һ�θ��ǲ�������ʹ���µ�value���Ǿɵ�valueֵ��
 *  
 * 
 */
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		//StringĬ��ʵ����Comarable�ӿ�
		Map<String,User> map = new TreeMap<>();
        map.put("china", new User("��ʯ",40));
        map.put("china", new User("�ɱ�����",26));
        map.put("american", new User("Լ��",30));
        map.put("france", new User("������",100));
        
        System.out.println(map.size());
        System.out.println(map);
        //User��Ȼ����       
        Map<User,String> uMap = new TreeMap<>();
        uMap.put(new User("zhangsan",20), "china");
        uMap.put(new User("lisi",10), "china");
        uMap.put(new User("wanmazi",28), "china");
        uMap.put(new User("zhangsan",18), "un");
        System.out.println(uMap.size());
        System.out.println(uMap);
	}
}
