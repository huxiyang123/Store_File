package homework;
/*
 * �����������һ��1-101�����������Ŵ�С;
 */
import java.util.Scanner;
public class GuessNum {
	public static void main(String[] args) {
		//�����������һ����
		int c = (int)(Math.random()*100+1);
		//¼�뺯��
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		System.out.println("������һ�����֣�");
		while(flag){
			int r =scan.nextInt();
			if(flag){
				if(c<r){
					System.out.println("���ˣ�����");
				}
				else if(c>r){
					System.out.println("С�ˣ�������");   
				}
				else{
					System.out.println("��ϲ��¶��ˣ�����");
					flag =!flag;
				}
			}
		}
	}
}
