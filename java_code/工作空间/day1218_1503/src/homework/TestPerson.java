package homework;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
/*
 * 1.TreeSet��ϰ
���࣬�������������룬���䣬�飬
���ࣺ�����������۸�
�洢TreeSet<Person>���ϣ��������
A���Ȱ����������򣺴Ӹߵ���
B��������ȵ�����£������������򣺴�С���
C�������������䶼��ȣ��������������ֵ�˳��String���compareTo������
D���������3�����Զ���ȣ������������Ȱ�����۸񣺴ӵ͵��ߣ������۸���ȣ������������ֵ�˳�򣩡�
 */
public class TestPerson {

	public static void main(String[] args) {
		
		Set<Person> set = new TreeSet<Person>();
		
		set.add(new Person("����",4500,21,new Book("javaһ�����",20)));
		set.add(new Person("����",4000,21,new Book("java�������",30)));
		set.add(new Person("����",4700,21,new Book("java�м����",25)));
		set.add(new Person("����",4000,21,new Book("java�弶���",40)));
		set.add(new Person("����",4900,21,new Book("java�ļ����",33)));
		
		Iterator<Person>  it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
