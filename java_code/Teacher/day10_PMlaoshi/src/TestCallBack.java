import com.qf.lesson.Boss;
import com.qf.lesson.Manager;
import com.qf.lesson.Worker;


public class TestCallBack {

	public static void main(String[] args) {
//		Boss b = new Boss();
//		b.start();
		
		Manager b = new Manager();
		b.start();
		Worker w = new Worker(b);
		w.work();
	}

}
