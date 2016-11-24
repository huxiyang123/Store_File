package Exercise;
/*
 * ì³²¨À­ÆõÊıÁĞ//1,1,2,3,5,8,13.....
 */
public class TestRecur {

	public static void main(String[] args) {
		
		System.out.println(fun(109));
	}
	public static int fun(int n){
		if(n<3){
			return 1;
		}
		else{

			return fun(n-1)+fun(n-2); 
		}
		
		
	}

}
