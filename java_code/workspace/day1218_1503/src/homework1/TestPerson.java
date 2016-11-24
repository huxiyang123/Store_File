package homework1;

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
		//�����ڲ��࣬Comparator �Ƚ���
		Set<Person> set = new TreeSet<Person>(new PersonComparator(){
			@Override
			public int compare(Person p1, Person p2) {
			if(p1.getIncome()!=p2.getIncome()){
				return -(p1.getIncome()-p2.getIncome());
			}
			if(p1.getAge()!=p2.getAge()){
				return p1.getAge()-p2.getAge();
			}
			if(p1.getName()!=p2.getName()){
				return p1.getName().compareTo(p2.getName());
			}
			if(p1.getBooks().getPrice()!=p2.getBooks().getPrice()){
				return p1.getBooks().getPrice()-p2.getBooks().getPrice();
			}
			if(p1.getBooks().getBookName()!=p2.getBooks().getBookName()){
				return p1.getBooks().getBookName().compareTo(p2.getBooks().getBookName());
			}
			return 0;
		}});
		
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
