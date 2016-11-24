package practice;

public class Recur1 {

	public static void main(String[] args) {
		//1,1,2,3,5,8,13......
		System.out.println(fun(6));
	}
	public static int fun(int n){
		int[] arr = new int[n];
		arr[0]= 1;
		arr[1] =1;
//		for(int i=0;i<n;i++){
//			arr[2]=arr[1]+arr[0];
//			arr[3]=arr[2]+arr[1];
//			arr[4]=arr[3]+arr[2];
//		}
//		
		if(n<2){
			return 1 ;
		}
		else{
		int a = arr[n-1]+arr[n-2];
			return fun(n-1)+a;
		}
	}

}
