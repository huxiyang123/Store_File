package homework4;
/*
 * 4  ĳ����˾���ù��õ绰�������ݣ���������λ��������
 * �ڴ��ݹ������Ǽ��ܵģ����ܹ������£�ÿλ���ֶ�����5������ֳ���10��������������֣�
 * �ٽ���һλ�͵���λ�������ڶ�λ�͵���λ������
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
