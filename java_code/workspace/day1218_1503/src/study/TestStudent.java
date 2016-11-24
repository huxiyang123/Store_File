package study;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestStudent {
	public static void main(String[] args) {
		Set<Student> s = new TreeSet<Student>(new StudentComparator());
        s.add(new Student("����", 18));
        s.add(new Student("����", 17));
        s.add(new Student("����", 16));
        s.add(new Student("����", 15));
        System.out.println(s.size());
        
        Iterator<Student> is = s.iterator();
        while(is.hasNext()){
        	System.out.println(is.next());
        }
	}

}
