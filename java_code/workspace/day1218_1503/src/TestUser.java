import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import study.User;


public class TestUser {
	public static void main(String[] args) {
		Set<User> set = new TreeSet<User>();
		set.add(new User("马六",16));
		set.add(new User("刘五",15));
		set.add(new User("张三",12));
		set.add(new User("王四",13));
		
		
		System.out.println(set.size());
		
		Iterator<User> iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}
