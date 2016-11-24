package study;
/*
 * ������(Producer)��������(Consumer)������Ҳ�����н绺������bounded-buffer�����⡣
 * 		��ָ�����߳�(�����)����һ��������������������һ���������ߣ����ڽ����ݷ��뻺������
 * 		����һ���������ߣ����ڴӻ�������ȡ�����ݡ�
 *   ���⣺
 *   	1 �������߳�֮���о�����ϵ�����¹������ݳ������������ʹ��synchronizedͬ�����ơ�
 *   	2 �������߳�֮���о�����ϵ�����¹������ݳ������������ʹ��synchronizedͬ�����ơ�
 *   	3 ��������������������ʱ����Ҫ֪ͨ������ֹͣ�������ȴ�֪ͨ��
 *   	    ���������ʹ��wait�������̵߳ȴ���ͬʱ֪ͨ(notify/notifyAll)�����߳̾�����
 *   	4 ����������������ʱ����Ҫ֪ͨ������ֹͣ���ѣ��ȴ�֪ͨ�����������ʹ��wait�������̵߳ȴ��� 

 */
public class TestProCon {

	public static void main(String[] args) {
		Shelf shelf =  new Shelf();
		Producer p = new Producer(shelf);
		p.setName("�߳�A");
		p.start();
		
		Consumer c = new Consumer(shelf);
		c.setName("�߳�B");
		c.start();

	}

}
