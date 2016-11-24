package homewowk14_17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 1 使用ArrayList保存1~100之间的数字，然后分别计算其中偶数的和、奇数的和
 */
public class ArrayList17 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<101;i++){
			list.add(i);
		}
		int oddNumber = 0,evenNumber = 0;
		for(int j:list){
			if(j%2==0){
				
				evenNumber+=j;
			}
			else{
				oddNumber+=j;
			}
		}
		System.out.println(evenNumber);
		System.out.println(oddNumber);
		
		
	}

}
