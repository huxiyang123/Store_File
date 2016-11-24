package study;
/*
 * ThreadLocal:
 */
public class TestThreadLocal {
	private static ThreadLocal<Integer> tl = new ThreadLocal<Integer>(){
			protected Integer initialValue() {
				return 0;
			};
		};
	public static void main(String[] args) {
		new Thread(){
			public void run(){
				for(int i=0;i<5;i++){
				//�ӵ�ǰ�̵߳ı��ر�����
				tl.set(tl.get()+1);
				}
			}
		}.start();
	}
	

}
