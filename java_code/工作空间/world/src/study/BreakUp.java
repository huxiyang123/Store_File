package study;

import java.util.ArrayList;
import java.util.List;

public class BreakUp {
	private List<Number> nList = new ArrayList<Number>();

	private int num=1;
	public synchronized void oddNumber(){
		if(num<101)
		if(num%2!=0){
			
			Number n = new Number("����", num++);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			nList.add(n);
			System.out.println(Thread.currentThread().getName()+n);
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

	public synchronized void evenNumber(){
		if(num<101)
		if(num%2==0){
			Number n = new Number("ż��", num++);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			nList.add(n);
			System.out.println(Thread.currentThread().getName()+"����"+n);
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
