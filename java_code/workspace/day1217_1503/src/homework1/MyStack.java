package homework1;

import java.util.LinkedList;

public class MyStack< T>{
	private LinkedList<T> list = new LinkedList<T>();
	
	public void add(T t){
		list.addFirst(t);
		
	}
	public T get(){
		return list.pollFirst();
	}
}
