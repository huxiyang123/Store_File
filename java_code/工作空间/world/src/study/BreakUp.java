package study;

import java.util.ArrayList;
import java.util.List;

public class BreakUp {
	private List<Number> nList = new ArrayList<Number>();

	private int num=1;
	public synchronized void oddNumber(){
		if(num<101)
		if(num%2!=0){
			
			Number n = new Number("奇数", num++);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
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
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

	public synchronized void evenNumber(){
		if(num<101)
		if(num%2==0){
			Number n = new Number("偶数", num++);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			nList.add(n);
			System.out.println(Thread.currentThread().getName()+"生产"+n);
			notify();
		}
		else{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
