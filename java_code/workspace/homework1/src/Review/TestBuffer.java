package Review;

public class TestBuffer {
	public static void main(String[] args) {
		int[] arr = { 1, 9, 4, 7, 3, 2 };
		sort(arr);
	}
	public static void sort(int x[]) {
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = 0; j < x.length - i - 1; j++) {
				if (x[j] > x[j + 1]) {
					int temp = x[j];
					x[j] = x[j + 1];
					x[j + 1] = temp;
				}
			}
		}
		for (int m : x) {
			System.out.print(m + " ");
		}
		System.out.println();
	}
}
