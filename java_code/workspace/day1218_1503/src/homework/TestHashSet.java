package homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import study.Student;

public class TestHashSet {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
		s1.add("��î");
		s1.add("��î");
		Iterator<String> ir =s1.iterator();
		while(ir.hasNext()){
			System.out.println(ir.next());
		}
		
	}

}
