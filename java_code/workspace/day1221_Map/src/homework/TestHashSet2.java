package homework;
/*
 * 2.创建一个HashSet对象，向这个对象中加入两个完全一样的String对象。
 * 编译运行此程序，观察是否有错误。打印出上题中的HashSet对象中的String对象，
 * 观察结果。
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet2 {

	public static void main(String[] args) {
		Set<String> st = new HashSet<String>();
		st.add("张三");
		st.add("张三");
		
		//System.out.println(st);
		//遍历打印
		Iterator<String> it = st.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}//结果不重复
	}
}
