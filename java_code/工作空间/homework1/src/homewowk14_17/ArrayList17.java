package homewowk14_17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 1 ʹ��ArrayList����1~100֮������֣�Ȼ��ֱ��������ż���ĺ͡������ĺ�
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
