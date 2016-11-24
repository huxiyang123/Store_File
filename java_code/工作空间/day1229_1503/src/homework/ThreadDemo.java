package homework;

import java.util.Iterator;

public class ThreadDemo implements Runnable {
	private Iterator<Student> it;


	public ThreadDemo(Iterator<Student> it) {
		this.it = it;
	
	}

	public void run() {		
		while(true){			
			synchronized (this) {
				try {
					Thread.sleep(2);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				if (it.hasNext()) {

					System.out.println(Thread.currentThread().getName()
							+ " ���� " + it.next().toString());
				}else{
					break;
				}
			}
		}
	}
}
