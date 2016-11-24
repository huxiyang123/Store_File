package study;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * TreeSet：保存的元素都是可排序
 * 	构造方法
 * 	实现方式：
 * 		1 可排序的对象对应的类实现Comparable接口：实现该接口的类的对象必须是可排序的
 * 	Comparetor(T t)
 * 		 比较此对象与指定对象的顺序。如果该对象小于、等于或大于指定对象，则分别返回负整数、零或正整数。 
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
		s2.add("中国");
		s2.add("中华");
		s2.add("国家");
		s2.add("国民");
		System.out.println(s2.size());
		
		Iterator<String> iter = s2.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
			
		}
		int i= '中'+1-1;				
		int i1= '国'+2-2;		//获取字符的对应的Unicode。
		int i3= '华'+1-1;
		System.out.println(i3);		
	}

}
