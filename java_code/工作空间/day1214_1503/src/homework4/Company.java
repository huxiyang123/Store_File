package homework4;
/*
 * 4  某个公司采用公用电话传递数据，数据是四位的整数，
 * 在传递过程中是加密的，加密规则如下：每位数字都加上5后的数字除以10的余数代替该数字，
 * 再将第一位和第四位交换，第二位和第三位交换。
 */
public class Company {
	public static void main(String[] args) {
		int[] a = new int[4];
		int x=9999,b,c;
		b = x%1000;
		a[0] = (x/1000+5)%10;
			
		a[1] =(b/100+5)%10;
		c = b%100;
		a[2] = (c/10+5)%10;
		a[3] = (c%10+5)%10;
		for(int j=a.length-1;j>=0;j--){
			System.out.print(a[j]);
		}
//		int sum = a[i+3]*1000+a[i+2]*100+a[i+1]*10+a[i];
//			System.out.println(sum);
	
	
		
	}
}
