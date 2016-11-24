package homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestUser {
	public static void main(String[] args) {
		Set<User> set = new HashSet<User>();
		set.add(new User("张三","性别"));
		set.add(new User("张三","性别"));
		Iterator<User> ite = set.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}
}
