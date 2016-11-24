package study;

import java.util.Comparator;

public class CustomComparator implements Comparator<User> {
    /*
     * 先按照名字排序，如果名字相同则按照年龄排序。此排序优先级高于集合中类的自然排序
     */
	@Override
	public int compare(User u1, User u2) {
		int result = u1.getName().compareTo(u2.getName());
		if(result == 0){
			result = u1.getAge() - u2.getAge();
		}
		return result;
	}

}
