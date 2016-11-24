package studypool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import study.SalerThread;



/*
 * JDK�ṩ���̳߳ؼ�����
 * 	ʹ�ò��裺
 * 	  1 ����ʵ��Runnable�ӿڻ�̳�Thread�������
 * 	  2 ��ʼ���̳߳�
 * 	  3 ͨ���̳߳ط�����̵߳��ò���1�����е�run()������
 * 	  4 ������Ҫ�ر��̳߳�
 */
public class TestThreadPool {

	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(4);
		for(int i=0;i<100;i++){
			ex.execute(new SalerThread("test"));
		}
		ex.shutdown();
	}

}
