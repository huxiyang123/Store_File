package study;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set���ʹ�ã�������ȫ�̳���Collection�ӿڣ�û����չ
 *   �����Ԫ����������Ҳ��ظ��ġ�
 * ʵ���ࣺ
 *   1 HashSet:
 *     Ԫ��������Ҳ��ظ�.
 *   ԭ��
 *     1 �ȼ���Ԫ�ص�hashCodeֵ��Ȼ��ɢ�б����Ƿ��и�ֵ��û�еĻ���ֱ�Ӵ�ţ��������������еĻ����������һ����
 *     2 Ȼ�����Ԫ�ض����equals��������ɢ�б��ж�Ӧλ�õ�����Ԫ�ؽ��бȽϡ�����true�򱣴�ʧ�ܣ����򱣴��Ԫ�ء�
 *   ȡֵʱ�ȸ���hashCodeֵ��ȡ��Ӧ��λ�ã�Ȼ���ڸ�λ��ѭ���ҵ���Ӧ��Ԫ�ء�
 *   ���浽HashSet�еĶ����Ӧ�������ʵ��hashCode��equals()�����Ա�Ƚ϶����Ƿ���ȡ�
 *     ��װ���String���Ѿ�������hashCode��equals������
 *     �Զ����������Ҫ�����HashSet�У�����븲��hashCode��equals������
 *       
 *   ��������
 *     new HashSet():��ʼ����Ϊ16�ļ��ϡ�
 *   ������
 *     add(E element):���Ԫ��
 *     iterator()�����ص����������ڵ���ʹ��  
 *   �ص㣺
 *   	1 ������Ԫ�صļ���˳��
 *    	1 ����ɾ��ȡ  Ч�ʺܸߣ�����HashCodeֵ��equals�������С�
 *   2 TreeSet:
 *     ������
 */
public class TestSet {
	public static void main(String[] args) {
		Set<Integer>  s = new HashSet<Integer>();
		s.add(new Integer(1));
		s.add(2);
		s.add(3);
		s.add( 2);
		System.out.println(s.size());
		
		Iterator<Integer>  it = s.iterator();
		while(it.hasNext()){
			int i = it.next();
			System.out.println(i);
		}
		
		Set<String>  s1 = new HashSet<String>();
		s1.add("zhangî1");
		s1.add("����");
		s1.add("��î");
		s1.add("������");
		s1.add("����");
		s1.add("zhangî1");
		s1.add("������2");
		s1.add("����");
		s1.add("����3");
		System.out.println(s1.size());
		
		Iterator<String>  it1 = s1.iterator();
		while(it1.hasNext()){
			String i = it1.next();
			System.out.println(i);
		}
		
	}
}
