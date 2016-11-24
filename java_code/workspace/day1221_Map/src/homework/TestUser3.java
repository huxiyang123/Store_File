package homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 3.创建一个User类，包含name和性别sex两个成员变量，
 * 向一个HashSet对象中加入两个完全一样的User对象，
 * 然后遍历HashSet对象中的User对象，并把这些User对象的成员变量打印在屏幕上。
 */
public class TestUser3 {

	public static void main(String[] args) {
		Set<User> set3 = new HashSet<User>();
		set3.add(new User("张三","男"));
		set3.add(new User("张三","男"));//通过hashCode和equals方法比较后确定为同一个对象
		Iterator<User> it3 = set3.iterator();
		while(it3.hasNext()){
			System.out.println(it3.next());
		}
	}
}

