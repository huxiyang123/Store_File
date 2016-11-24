package study;

import java.util.Comparator;

public class CustomComparator implements Comparator<User> {
    /*
     * �Ȱ��������������������ͬ�����������򡣴��������ȼ����ڼ����������Ȼ����
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
