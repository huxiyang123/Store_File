package Studyfile;

import java.io.File;

public class TestDir2 {

	public static void main(String[] args) {
		File dir = new File("hello");
        dir.mkdir();
        
        
        File dir2 = new File("world\\world1\\world2\\world3");
        dir2.mkdirs();
	}

}
