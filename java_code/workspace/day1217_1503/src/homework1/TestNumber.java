package homework1;

import java.util.ArrayList;
import java.util.List;

public class TestNumber {

	public static void main(String[] args) {
		List<Integer> list = new  ArrayList<Integer>();
		for(int i=1;i<101;i++){
			list.add(i);
		}
		int oddNumber = 0,evenNumber = 0;
		for(int j:list){
			System.out.print(j+" ");
			System.out.println();
			if(j%2==0){
				evenNumber+=j;
			}
			else{
				oddNumber+=j;
			}
		}
		System.out.println("偶数共有："+evenNumber+" 奇数共有："+oddNumber);
	}
}
