package homework2;

/*
 * 2  ���һ�����������ڻ�ȡһ��������飬����Ϊ10����ֵȡ��[1,10],�����е����ݲ����ظ���
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
