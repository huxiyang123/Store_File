package homewowk14_17;
/*
 * 2  将给定字符串str="1,2,3!4,5,6,0!7,8,9"存入二维数组中。
 */
public class DivideArray16 {
	public static void main(String[] args) {
		String str="1,2,3!4,5,6,0!7,8,9";
		int n=3;
		String[][] array =new String[n][];
		String[] arr = str.split("!");
		for(int i=0;i<arr.length;i++){
			array[i]=arr[i].split(",");
		}
		for(String[] a:array){
			for(String b:a){
				System.out.print(b+",");
			}
			System.out.println();
		}
		
	}
}
