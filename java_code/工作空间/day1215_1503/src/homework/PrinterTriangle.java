package homework;

public class PrinterTriangle {
/*
 * 4  ʹ�ö�ά�����*�Ŵ�ӡ���������Σ�
 	*****
 	****
 	***
 	**
 	*
 */
	public static void main(String[] args) {
		method(6);
	}
	public static void method(int n){
		String[][] array = new String[n][];
		int j=array.length;
		for(int x=0;x<j;x++){
			array[x] = new String[n-x];
			for(int y=0;y<array[x].length;y++){

				System.out.print("*");
			}
			System.out.println();
		}
	}
}
