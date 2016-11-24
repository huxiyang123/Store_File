package homework;

import java.util.Scanner;

public class TestCard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入存钱数目：");
		int n = sc.nextInt();
		System.out.println("请输入取钱数目：");
		int m = sc.nextInt();
		
		//Account(账户名，余额，一次存入的金额n，一次取出的金额m)
		Account ac = new Account("村长",0,n,m);
		Card cd = new Card(ac);
		Card.saveMoney sm = cd.new saveMoney();
		new Thread(sm,"习大大").start();
		new Thread(sm,"李克强").start();
		new Thread(sm,"胡锦涛").start();
		new Thread(sm,"温家宝").start();
		
		Card.getMoney1 gm = cd.new getMoney1();
		new Thread(gm,"喜羊羊").start();
		new Thread(gm,"懒羊羊").start();
		new Thread(gm,"暖羊羊").start();
		new Thread(gm,"沸羊羊").start();
		new Thread(gm,"灰太狼").start();

	}

}
