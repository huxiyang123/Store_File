package strudythread;
/*
 * ʹ�ü̳�ģ����Ʊ
 */
public class TicketSaler extends Thread {
	//��Ʊ������ʹ��static���Σ���֤�ĸ���Ʊ�㹲����һ�������
	private  static int num =100;
	
	public TicketSaler(String name) {
		super(name);
	}

	

	@Override
	public void run() {
		while(num>0){
			System.out.println(Thread.currentThread().getName()+"������Ʊ"+num--);
		}
	}
}
