package homework;

import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {
		int c = (int)(Math.random()*100+1);
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		System.out.println("请输入一个整数");
        while(flag){
        	int r = scan.nextInt();
        	if(r>c){
        		System.out.println("大了！！");
        	}
        	else if(r<c){
        		System.out.println("小了！！");
        	}
        	else{
        		System.out.println("恭喜你，猜中了！！");
        		flag = false;
        	}
        }
	}

}
