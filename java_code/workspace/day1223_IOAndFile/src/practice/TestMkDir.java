package practice;

import java.io.File;

public class TestMkDir {

	public static void main(String[] args) {
		File file = new File("d:\\test\\11");
		file.mkdirs();
	}

}
