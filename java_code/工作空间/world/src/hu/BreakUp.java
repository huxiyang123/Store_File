package hu;

import java.util.ArrayList;
import java.util.List;



public class BreakUp {
	private List<Product> pList = new ArrayList<Product>();

	private int no=1;
	public synchronized void OddNumber(){
		
		if(no%2!=0){
			
			Product p = new Product("����", no++);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			pList.add(p);
			System.out.println(Thread.currentThread().getName()+"����"+p);
			notify();
		}
		else{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}

	public synchronized void condsumeProduct(){
		if(no%2==0){
			Product p = new Product("ż��", no++);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			pList.add(p);
			System.out.println(Thread.currentThread().getName()+"����"+p);
			notify();
		}
		else{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
}
