package homework;

import java.util.Scanner;

public class TestCard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������Ǯ��Ŀ��");
		int n = sc.nextInt();
		System.out.println("������ȡǮ��Ŀ��");
		int m = sc.nextInt();
		
		//Account(�˻�������һ�δ���Ľ��n��һ��ȡ���Ľ��m)
		Account ac = new Account("�峤",0,n,m);
		Card cd = new Card(ac);
		Card.saveMoney sm = cd.new saveMoney();
		new Thread(sm,"ϰ���").start();
		new Thread(sm,"���ǿ").start();
		new Thread(sm,"������").start();
		new Thread(sm,"�¼ұ�").start();
		
		Card.getMoney1 gm = cd.new getMoney1();
		new Thread(gm,"ϲ����").start();
		new Thread(gm,"������").start();
		new Thread(gm,"ů����").start();
		new Thread(gm,"������").start();
		new Thread(gm,"��̫��").start();

	}

}
