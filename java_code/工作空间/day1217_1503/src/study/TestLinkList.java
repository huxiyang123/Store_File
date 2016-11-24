package study;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * LinkList��ʹ��˫������ṹ
 * 	���췽����
 * 		LinkList()��Ĭ�Ͽ��б�
 * 	��������չlist�ķ�������Ϊlist����û�С����Լ���������list
 * 		1 addFirst(E  e):����ָ���б�Ŀ�ͷ
 * 		2 addLast(E e)
 * 		3 getFirst()
 * 		4 getLast()
 * �ص㣺
 * 		1 �ʺ���Ƶ���Ĳ����ɾ��������ԭ���ǲ�����ֻ�Ǹ��������á�
 * 		2 �ʺ��ںͶ���
 * 			ջ   FILO  ,�Ƚ������
 * 			����  FIFO   �Ƚ��ȳ���һ�����ݽṹ
 */
public class TestLinkList {
	public static void main(String[] args) {
		LinkedList<String>  ll = new LinkedList<String>(); 
		ll.add("first");
		ll.addFirst("second");
		ll.add("thid");
		ll.addLast("fouth");
		ll.addFirst("second");
		
		Iterator<String>  it= ll.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+"  ");
		}
		System.out.println();
		System.out.println(ll.getFirst()+"  "+ll.getLast());
	}
}	
