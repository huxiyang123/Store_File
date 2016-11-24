package practice;

import java.util.ArrayList;
import java.util.List;

/*
 * �������������Ź�������
 */
public class Basket {
	private Apple[] arr = new Apple[2];//List<Apple> appleList = new ArrayList<Apple>();
	private int no;
	public synchronized void put(){
		if(arr[0]==null){
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			Apple apple = new Apple("�츻ʿ",++no);
			//appleList.add(apple);
			arr[0] = apple;
			System.out.println(Thread.currentThread().getName()+"���ƻ��"+apple);
			notifyAll();
		}
		else{//����������������������������߽���this�������wait�ȴ���
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
	//������ȡ����������
	public synchronized void get(){
		if(arr[0]!=null){
			System.out.println(Thread.currentThread().getName()+"ȡ��ƻ��"+arr[0]);
			arr[0]=null;
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
