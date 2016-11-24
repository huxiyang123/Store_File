package practice;



import java.io.InputStream;

/*
 * 当被调用者操作执行完毕，通过send方法通知调用者。		
 */
public interface Callback1 {
	void send(InputStream bs);
}

