package strudythreadpriority;

public class TestThreadStop {

	public static void main(String[] args) {
		MyThread mt  =new MyThread();
		mt.setName("�����߳�");
		mt.start();
		for(int i =0;i<100;i++){
			if(i==50){
				
				mt.fun(false);
			}
		
			System.out.println("mian"+i);
		}
	}

}
class MyThread extends Thread{
	boolean flag = true;
	@Override
	public void run() {
		while(flag){
			System.out.println(Thread.currentThread().getName()+"ִ����");
		}
	}
	public void fun(boolean flag){
		this.flag =flag;
	}
}