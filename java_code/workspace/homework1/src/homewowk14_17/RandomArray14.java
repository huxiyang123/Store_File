package homewowk14_17;
/*
 * 2  ���һ�����������ڻ�ȡһ��������飬����Ϊ10����ֵȡ��[1,10],�����е����ݲ����ظ���
��ʾ��[1,10]��Χ�����int x = (int) (Math.random() * 10 + 1);
 */
public class RandomArray14 {

	public static void main(String[] args) {
		int[] arr = new int[10];		
		int i=0;
		while(i<10){
			int x = (int) (Math.random() * 10 + 1);
			boolean flag = true;
			for(int j=0;j<i+1;j++){
				if(arr[j]==x){
					flag = !flag;
					break;
				}				
			}
			if(flag){
				arr[i]=x;
				i++;
			}
		}
		for(int a:arr){
			System.out.print(a+" ");
		}
	}
}
