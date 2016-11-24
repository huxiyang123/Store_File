package study;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * TreeSet�������Ԫ�ض��ǿ�����
 * 	���췽��
 * 	ʵ�ַ�ʽ��
 * 		1 ������Ķ����Ӧ����ʵ��Comparable�ӿڣ�ʵ�ָýӿڵ���Ķ�������ǿ������
 * 	Comparetor(T t)
 * 		 �Ƚϴ˶�����ָ�������˳������ö���С�ڡ����ڻ����ָ��������ֱ𷵻ظ������������������ 
 * 		3
 */
public class TestTreeSet {

	public static void main(String[] args) {
		Set<Integer> s = new  TreeSet<Integer>();
		s.add(10);
		s.add(4);
		s.add(9);
		s.add(2);
		System.out.println(s.size());
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		Collection<String> s1 = new  TreeSet<String>();
		s1.add("abc");
		s1.add("bac");
		s1.add("dbc");
		s1.add("aec");
		System.out.println(s1.size());
		
		Iterator<String> ite = s1.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		
		Collection<String> s2 = new  TreeSet<String>();
		s2.add("�й�");
		s2.add("�л�");
		s2.add("����");
		s2.add("����");
		System.out.println(s2.size());
		
		Iterator<String> iter = s2.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
			
		}
		int i= '��'+1-1;				
		int i1= '��'+2-2;		//��ȡ�ַ��Ķ�Ӧ��Unicode��
		int i3= '��'+1-1;
		System.out.println(i3);		
	}

}
