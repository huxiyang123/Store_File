package homework1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
/*
 * 1.TreeSet练习
人类，属性姓名，收入，年龄，书，
书类：属性书名，价格
存储TreeSet<Person>集合，排序规则：
A：先按照收入排序：从高到低
B：收入相等的情况下，按照年龄排序：从小大大
C：如果收入和年龄都相等，按照姓名排序，字典顺序（String类的compareTo方法）
D：如果以上3个属性都相等，按照书排序，先按照书价格：从低到高，如果书价格相等，按照书名（字典顺序）。
 */
public class TestPerson {

	public static void main(String[] args) {
		//匿名内部类，Comparator 比较器
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
		
		set.add(new Person("张三",4500,21,new Book("java一级编程",20)));
		set.add(new Person("张三",4000,21,new Book("java三级编程",30)));
		set.add(new Person("张三",4700,21,new Book("java中级编程",25)));
		set.add(new Person("张三",4000,21,new Book("java五级编程",40)));
		set.add(new Person("张三",4900,21,new Book("java四级编程",33)));
		
		Iterator<Person>  it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
