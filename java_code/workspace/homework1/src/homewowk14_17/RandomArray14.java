package homewowk14_17;
/*
 * 2  设计一个方法，用于获取一个随机数组，长度为10，数值取自[1,10],数组中的数据不能重复。
提示：[1,10]范围随机数int x = (int) (Math.random() * 10 + 1);
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
