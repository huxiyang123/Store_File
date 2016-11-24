package homework1;

/*
 * 2  将给定字符串str="1,2,3!4,5,6,0!7,8,9"存入二维数组中。
 */
public class TestArray {
	public static void main(String[] args) {
		String str = "1,2,3!4,5,6,0!7,8,9";
		
		String str1[] = str.split("!");
		String[][] array = new String[str1.length][];

		for (int j = 0; j < array.length; j++) {
			array[j] = str1[j].split(",");
		}
		for (String[] s : array) {
			for (String d : s) {
				System.out.print(d + " ");
			}
			System.out.println();
		}
	}
}
