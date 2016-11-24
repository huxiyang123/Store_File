package homework2;

import java.util.LinkedList;

public class Cabinet<A> {
	private LinkedList<A> list = new LinkedList<A>();
	
	public void add(A a){
		list.addFirst(a);
	}
	public A getDish(){
		return list.pollFirst();
	}	
}
