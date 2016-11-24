package study;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ����Collection
 * 	�ص㣺
 * 		1 ������̬�仯
 * 		2 ʵʱ��ȡ������������
 * ע�⣺������ֻ�ܱ������
 * ���Ϻ����飺
 * 		��ͬ�㣺���ܱ�������
 * 		����
 * 		  1 ����һ����ʼ���󣬴�С���ɱ䡣�����ϳ�ʼ�����С��̬�仯
 * 		  2 �����ṩ�ķ���ֻ�ǻ�ȡ�������������׻�ȡ��������������Ͽ���ʵʱ��ȡ�����������
 * 		  3 ������Ա�������������ͺ������������ͣ�����ֻ�ܱ���������������
 * �ṹ��
 *  һ��Collection�ӿڣ�
 *  	--List�ӿڣ�����Ŀ����ظ���
 *  	 --ArrayListʵ����(����)
 *  	 --LinkedListʵ����(����)
 *  	--Set�ӿڣ������ظ�
 *  	  --HashSetʵ����(����)
 *  	--SortedSet�ӿ�
 *  	  --TreeSetʵ����(����)
 *  ����Map�ӿ�
 *  	--HashMapʵ����(����)
 *  	--HashTable
 *   	  --Porpertiesʵ����(����)
 *   	--SortedHashMap�ӿڣ�
 *   	  TreeMapʵ����(����)
 *   ����Iterator��������������ȡCollection���ͽ�������ݵ�һ���ࡣ
 *   �ġ�Collections�����ࣺCollection������Ĺ����࣬ΪCollection�����ṩ���߷���
 *   �塢Comparator�Ƚ�����Cpmparable�ӿڣ�Collection�б���Ԫ���ܽ��д�С�Ƚ�(����)
 *   1 Collection
 *   	1) add(E e):
 *   	2) add(Collection e): *   
 *   	3) contains(Object o)
 *   	4) isEmpty()������Ԫ���Ƿ�Ϊ��
 *   	5) remove(Object o):�Ƴ�ָ��Ԫ��
 *   	6) clear�������Ƴ�����Ԫ��
 *   	7) size():������Ԫ������
 *   	8) toArray():������Ԫ��ת��Ϊ����
 *   2 List�ӿ�
 *   	1) add(int  index,E element)
 *   	2) get (int index)
 *   	3) indexOf(Object o) ���������ڼ����е�һ�γ��ֵ�����
 *   	4)lastIndexOf(Object o)
 *   	5) set(int  index,E element)
 *   	6) subList()
 *   3 ArrayList ������ʵ�ָ��ӿ������еķ����ң���ʵ������������
 *    ���췽����ArrayList();Ĭ������Ϊ10�Ŀռ���
 *    �ص㣺
 *    	1) Ĭ�ϰ������˳�򱣴�Ԫ��
 *    	2) Ԫ�ؿ����ظ�
 *    	3)	
 *   ArrayList
 *   	1)��ѯ�ٶ��ر�죬�ײ�ʹ�����飬����������ѯ
 *   	2)�����ɾ��������
 *   ʹ�ó�����
 *   	��ѯƵ�αȽ϶ԣ����м�λ�ò����ɾ���Ƚ��ٵ����
 *   	3)
)
 */
public class TestCollection {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("hello");
		c1.add("world");
		System.out.println("�Ƿ�Ϊ��     "+c1.isEmpty());
		System.out.println("Ԫ������    "+c1.size());
		
		Collection c2 = new ArrayList();
		c2.add("nishi");
		c1.addAll(c2);
		System.out.println("Ԫ������  "+c1.size());
		
		for(Object s:c1.toArray()){
			System.out.print(s);
		}
		
		System.out.println("�Ƿ����world:  "+c1.contains("world"));
		boolean f = c1.remove("nishi");
		if(f){
			System.out.println("�Ƴ���"+c1);
		}
		else{
			System.out.println(c1);
		}
		
		c1.clear();     //�������Ԫ��
		System.out.println(c1);

			
	}

}
