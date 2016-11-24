package study;

import java.util.Comparator;

/*
 * Comparator比较器接口
 * 	场景：
 * 		1  已有的实现 Comparable接口的类，排序规则不适合。
 * 		2 给已经没有实现Comparable接口的类提供排序规则。
 */
public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getName().equals(s2.getName())){
			return s1.getAge() - s2.getAge();
		}
		else{
			return s1.getName().compareTo(s2.getName());
		}
		
	}

}
