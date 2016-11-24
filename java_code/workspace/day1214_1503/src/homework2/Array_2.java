package homework2;

/*
 * 2  设计一个方法，用于获取一个随机数组，长度为10，数值取自[1,10],数组中的数据不能重复。
 */
public class Array_2 {
	public static void main(String[] args) {
		int[] array= new int[10];
		int j=0;
		while(j<10){
			int num = (int)(Math.random()*10+1);
			s:for(;;){
				for(int x=0;x<j;x++){	
					if(array[x]==num){
						break s;
					}
				}				
				array[j++] = num;
				break;
			}
		}
		for(int a:array){
			System.out.print(a+" ");
		}
		
	}
}
