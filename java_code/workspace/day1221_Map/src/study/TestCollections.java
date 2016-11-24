package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Collections�����ࣺ
 *   ����Collection���ϵĹ����࣬�ṩ��һЩ��̬����ʵ���˻��ڼ��ϵ�һЩ�����㷨 ��
 *   ������
 *    1 sort(List<T> list):����Ԫ�ص���Ȼ˳�� ��ָ���б������������
 *    2 sort(List<T> list, Comparator<? super T> c): 
                         ����ָ���Ƚ���������˳���ָ���б��������
 *    3 reverse(List<?> list):��תָ���б���Ԫ�ص�˳��
 *    4 copy(List<? super T> dest, List<? extends T> src): 
                        ������Ԫ�ش�һ���б��Ƶ���һ���б�Ŀ���б��Ԫ�ظ���������ڵ���Դ�б�
 */
public class TestCollections {

	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
		list.add(new User("bc", 17));
		list.add(new User("bd", 18));
		list.add(new User("aa", 19));
		list.add(new User("ab", 16));
		
//		System.out.println(list);
//		
//		//Collections.sort(list);
//		Collections.sort(list, new CustomComparator());
//		
//		System.out.println(list);
//		
//		Collections.reverse(list);
//		System.out.println(list);
		System.out.println(list.size());
		List<User> newList = new ArrayList<>();
		newList.add(null);
		newList.add(null);
		newList.add(null);
		newList.add(null);
		System.out.println(newList.size());
		System.out.println("size:  "+newList.size());
		Collections.copy(newList, list);
		System.out.println(newList);
	}

}
