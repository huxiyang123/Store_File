package homework;
/*
 * ���������߳�A,B;�ֱ���A��B��ӡ�桢ż����
 */
public class TestThreadNum {

	public static void main(String[] args) {
		ThreadNum tn = new ThreadNum();
		new Thread(tn,"������").start();
		new Thread(tn,"ϰ���").start();

	}

}
