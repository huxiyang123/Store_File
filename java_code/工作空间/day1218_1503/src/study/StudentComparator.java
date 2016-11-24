package study;

import java.util.Comparator;

/*
 * Comparator�Ƚ����ӿ�
 * 	������
 * 		1  ���е�ʵ�� Comparable�ӿڵ��࣬��������ʺϡ�
 * 		2 ���Ѿ�û��ʵ��Comparable�ӿڵ����ṩ�������
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
