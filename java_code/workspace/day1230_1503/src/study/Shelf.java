package study;

import java.util.ArrayList;
import java.util.List;

/*
 * 共享数据区
 * 	存放产品
 */
public class Shelf {
	private List<Product> pList = new ArrayList<Product>();
	/*
	 * 添加商品：
	 * 	  1 判断共享区是否有位置可以存放数据
	 * 	  2 共享区满了则访问该方法的线程
	 */
	private int no;
	public synchronized void addProduct(){
		if(pList.size()==0){
			
			Product p = new Product("产品", no++);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			pList.add(p);
			System.out.println(Thread.currentThread().getName()+"生产"+p);
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
	/*
	 * 消费产品：
	 * 	  1 判断共享区是否有数据，有责获取一个，同时通知生产
	 * 	  2 共享区满了则访问该方法的线程
	 */
	public synchronized void condsumeProduct(){
		if(pList.size()>0){
			System.out.println(Thread.currentThread().getName()+"消费了产品 "+pList.remove(0));
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
