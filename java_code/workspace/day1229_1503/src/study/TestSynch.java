package study;
/*
 * ���߳�֮������ݰ�ȫ����
 * 	����̶߳Թ�������ݴ���������⵼�½������ȷ��
 * 	���������ʹ���̵߳�ͬ�����ƣ�Javaʹ��synchronized�ؼ��ֺͶԶ���ͬ�����н����
 * 	sychronized�ؼ��֣����Java���߳�ͬ���İ�ȫ����
 * 	     ʹ�÷�ʽ��
 * 		1 ͬ�������:
 * 		  synchronized(){
 * 			��Ҫͬ���Ĵ����
 * 		  }//�����������new
 * 		2 ͬ��������
 * 		 [���η�] synchronized��������(){
 * 			��Ҫͬ���Ĵ����
 * 		}
 * 		
 * 
 */
public class TestSynch {

	public static void main(String[] args) {
		TicketSaler ts = new TicketSaler();
		new Thread(ts,"��һ��Ʊ��").start();
		new Thread(ts,"�ڶ���Ʊ��").start();
		new Thread(ts,"������Ʊ��").start();
		new Thread(ts,"������Ʊ��").start();

	}

}
