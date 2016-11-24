package homewowk14_17;

import java.util.LinkedList;

/*
 * 2 ʹ��LinkedListģ��˿��Ŷӽ��˹��̡��Ŷ��Ƚ��ȳ�(FIFO)
 */
public class LineUp17<B> {
	LinkedList<B>  ll  = new LinkedList<B>();
	public void add(B b){
		ll.addFirst(b);
	}
	public B get(){
		return ll.pollLast();
	}
}
class Person{
	private String person;
	/* ���� Javadoc��
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [person=" + person + "]";
	}
	public Person(String person) {
		super();
		this.person = person;
	}
	public static void main(String[] args) {
		LineUp17<Person> lu = new LineUp17<Person>();
		for(int i=0;i<10;i++){
			Person p = new Person("�˿�"+i);
			lu.add(p);
		}
		for(int j=0;j<10;j++){
			System.out.println(lu.get());
		}

	}
}
