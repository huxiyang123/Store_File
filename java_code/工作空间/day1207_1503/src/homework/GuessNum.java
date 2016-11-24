package homework;
/*
 * 电脑随机生成一个1-101的数，我来才大小;
 */
import java.util.Scanner;
public class GuessNum {
	public static void main(String[] args) {
		//电脑随机生成一个数
		int c = (int)(Math.random()*100+1);
		//录入函数
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		System.out.println("请输入一个数字：");
		while(flag){
			int r =scan.nextInt();
			if(flag){
				if(c<r){
					System.out.println("大了！！！");
				}
				else if(c>r){
					System.out.println("小了！！！！");   
				}
				else{
					System.out.println("恭喜你猜对了！！！");
					flag =!flag;
				}
			}
		}
	}
}
