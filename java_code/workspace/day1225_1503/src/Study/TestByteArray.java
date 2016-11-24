package Study;


/*
 * 内存流：
 * 	1 ByteArrayInputStream：包含一个内部缓冲区，该缓冲区包含从六中读取的字节。
 * 	构造方法：
 * 	  ByteArrayInputStream(byte[] buf)：创建一个 ByteArrayInputStream，使用 buf 作为其缓冲区数组。
 * 	2 ByteArrayOutputStream：实现一个输出流，其中的数据被写入一个byte数组中。
 * 	构造方法：
 *    ByteArrayOutputStream() 创建一个新的 byte 数组输出流。
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;


public class TestByteArray {

	public static void main(String[] args) {
		//放置
		ByteArrayInputStream bais = new ByteArrayInputStream("hello\r\n world".getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int ch = 0;
		while((ch=bais.read())!=-1){
			//int result = ch-32;
			int result = Character.toUpperCase(ch);
			//把转换后的结果方法输出对象的缓冲区中
			baos.write(result);
		}
		System.out.println(new String(baos.toString()));
	}

}
