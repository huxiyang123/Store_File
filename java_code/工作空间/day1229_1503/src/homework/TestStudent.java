package homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestStudent {

	public static void main(String[] args) {
		fun(10,5);		
	}
	
	//number1��ʾ��������number2��ʾ���߳���
	
	public static void fun(int number1,int number2){
		Set<Student> set = new HashSet<Student>();
		
		for(int i=0;i<number1;i++){
			set.add(new Student("ϰ���"+i,i));
		}
		
		Iterator<Student> it = set.iterator();
		
		ThreadDemo td = new ThreadDemo(it);
		
		for(int i=0;i<number2;i++){
			new Thread(td,"����"+i).start();			
		}		
	}
}
