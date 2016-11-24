package homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestStudent {

	public static void main(String[] args) {
		fun(10,5);		
	}
	
	//number1表示总人数，number2表示总线程数
	
	public static void fun(int number1,int number2){
		Set<Student> set = new HashSet<Student>();
		
		for(int i=0;i<number1;i++){
			set.add(new Student("习大大"+i,i));
		}
		
		Iterator<Student> it = set.iterator();
		
		ThreadDemo td = new ThreadDemo(it);
		
		for(int i=0;i<number2;i++){
			new Thread(td,"张三"+i).start();			
		}		
	}
}
