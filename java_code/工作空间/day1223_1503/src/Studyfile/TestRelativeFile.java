package Studyfile;

import java.io.File;
import java.io.IOException;

public class TestRelativeFile {

	public static void main(String[] args) {
		File file = new File("test.txt");
        if(!file.exists()){
        	boolean isSuccess= false;
			try {
				isSuccess = file.createNewFile();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
        	if(isSuccess){
        		System.out.println("success"); 
        	}
        	else{
        		System.out.println("failure!!");
        	}
        }
	}

}