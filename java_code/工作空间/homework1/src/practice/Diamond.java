package practice;

public class Diamond {

	public static void main(String[] args) {
		int n = 5,y=n;
		for (int i = 0; i < 2*n; i++) {
			if (i < n) {
				for (int j = 0; j < n - i-1 ; j++) {
					System.out.print(" ");
				}
				for (int x = 0; x < 2 * i + 1; x++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else{
				for (int j = 0; j <i-n+1; j++) {
					System.out.print(" ");
				}
				y--;
				for (int x = 0; x < 2*y-1;x++) {
					System.out.print("*");
					
				}
				System.out.println();
				
			}	
		}
	}
}
