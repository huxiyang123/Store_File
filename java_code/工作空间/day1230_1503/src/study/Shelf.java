package study;

import java.util.ArrayList;
import java.util.List;

/*
 * ����������
 * 	��Ų�Ʒ
 */
public class Shelf {
	private List<Product> pList = new ArrayList<Product>();
	/*
	 * �����Ʒ��
	 * 	  1 �жϹ������Ƿ���λ�ÿ��Դ������
	 * 	  2 ��������������ʸ÷������߳�
	 */
	private int no;
	public synchronized void addProduct(){
		if(pList.size()==0){
			
			Product p = new Product("��Ʒ", no++);
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
	/*
	 * ���Ѳ�Ʒ��
	 * 	  1 �жϹ������Ƿ������ݣ������ȡһ����ͬʱ֪ͨ����
	 * 	  2 ��������������ʸ÷������߳�
	 */
	public synchronized void condsumeProduct(){
		if(pList.size()>0){
			System.out.println(Thread.currentThread().getName()+"�����˲�Ʒ "+pList.remove(0));
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
