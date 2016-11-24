package practice;

public class Recur {
	public static void main(String[] args) {
	//	Hello h = new Hello(); 
		System.out.println(new Recur().multiply(-2));
	}
	public int multiply(int n){
		if(n<1){
			return n;
		}
		else{
			return n*multiply(n-1);
		}
	}
}
