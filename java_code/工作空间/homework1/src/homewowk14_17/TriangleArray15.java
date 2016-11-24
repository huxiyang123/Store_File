package homewowk14_17;

public class TriangleArray15 {
	public static void main(String[] args) {
		String[][] arr = new String[5][];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new String[5-i];
			for (int j = 0; j < arr.length-i; j++) {
				arr[i][j] = "*";
			}
		}
		for (String[] d : arr) {
			for (String s : d) {
				System.out.print(s);
			}
			System.out.println();
		}
	}
}

