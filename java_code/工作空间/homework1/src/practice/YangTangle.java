package practice;
/*
 *   1
    121
   12321
  1234321
 */
public class YangTangle {

	public static void main(String[] args) {
		int n = 4;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				System.out.print(" ");
			}
			for(int m= 1;m<i+1;m++){
				System.out.print(m);
			}
			for(int x=i+1;x>0;x--){
				System.out.print(x);
			}
			System.out.println();		
		}
	}
}
