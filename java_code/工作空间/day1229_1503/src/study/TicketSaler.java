package study;

public class TicketSaler extends Thread {
	private int num = 100;
	
	Object obj = new Object();
	@Override
	public void run() {
		while(true){
			//��ʾ���������
			synchronized(obj){	
			if(num>0){
//				try {
//					Thread.currentThread().sleep(10);
//				} catch (InterruptedException e) {
//					// TODO �Զ����ɵ� catch ��
//					e.printStackTrace();
//				}
				System.out.println(Thread.currentThread().getName()+"������Ʊ��"+num--);
			}}
		}

	}
}

