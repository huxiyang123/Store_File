package Exam;
/*
 * 1  ʹ�õݹ����1+2+3+4+...+100�ĺ͡�
 */
public class recur {
	public static void main(String[] args) {
		System.out.println(new recur().add(100));
	}
	public int add(int i){
		if(i>0){
			return i+add(i-1);
		}
		else{
			return i;
		}
	}
}
