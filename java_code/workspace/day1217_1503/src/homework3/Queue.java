package homework3;

import java.util.LinkedList;

public class Queue<B> {
	LinkedList<B> list = new LinkedList<B>();
	public void add(B e){
		list.addLast(e);
	}
	public B get(){
		return list.pollFirst();
	}
}
