package study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/*
 * ���ͣ��ڶ���һ������ʱ��ָ�����ϴ洢�Ķ������������.������������������
 * �﷨����������<��������>
 *   �ص㣺
 *     1 ����ʱ��ֻ�ܱ���ָ���������͵�����
 *     2 ȡ������ʱ�򣬲���Ҫǿ������ת����
 * ���ࣺ���˽⣩
 *   1 �������������Կ����������͵�ռλ������<��������...>����������һ��ʹ�ô�дӢ����ĸ���������ʹ�ö��Ÿ�����
 *   2 ������������
 *    ���ͷ�����
 *    [���η�] T   ������(��������  ����){ //T�Ƿ�������
 *      return T���ͱ�����
 *    } 
 * Iterator�ӿڣ�Collectionϵ����һ�ֻ�ȡ����Ԫ�صĵ���������
 *   ������
 *     1 next():���ص�������һ��Ԫ��
 *     2 hasNext():�ж���һ��Ԫ���Ƿ���ڣ����ڷ���true,����false
 *     3 remove():�Ƴ�ָ������Ԫ�أ����뱣֤����Ԫ�ش��ڣ���������쳣��
 *     
 */
public class TestList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add(0, "world");
		list.add("ni");
		list.add("hao");
		list.add("hao");
		list.add(null);
//		list.add(new User());
//		list.add(1);      
       		
		for (int i = 0; i < list.size(); i++) {			
			System.out.println(list.get(i));
		}
		System.out.println("=========");
		for (String o : list) {			
			System.out.println(o);
		}
		System.out.println("=========");
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()){
			it.next();
			it.remove();
		}
        System.out.println(list.size());
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);// �Զ�װ�� new Integer(1);
		list2.add(2);
		list2.add(3);

		for (int i : list2) {//�Զ����䣺new Integer(1).intValue();			
			System.out.println(i);
		}
		
//		List<User> uList = new ArrayList<User>();
//        uList.add(new User());
//        //uList.add("afas");
//        for(User u : uList){
//        	System.out.println(u);
//        }
	}

}

