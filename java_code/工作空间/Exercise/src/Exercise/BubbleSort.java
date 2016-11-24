package Exercise;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 1, 8, 78, 4, 23, 12 };
		System.out.println("����ǰ��");
		print(arr);
		
		bubbleSort(arr);
		System.out.println("ð������");	
		print(arr);
		int index = halfSearch(arr,8);
		System.out.println("index="+index);
		
		selectSort(arr);
		System.out.println("ѡ������");
		print(arr);
		int index1 = halfSearch(arr,9);
		System.out.println("index="+index1);
	}
	//ѡ������
	public static void selectSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					swap(arr,i,j);
				}
			}
		}
	}

	// bubbleð������
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr,j,j+1);
				}
			}
		}
	}
	//���齻��λ��
	public static void swap(int[] arr,int a,int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	//��ӡ����
	public static void print(int[] arr){
		for (int d : arr) {
			System.out.print(d + " ");
		}
		System.out.println();
	}
	//ʹ���۰����,���ض�Ӧ�������������Ҫ���ҵ�Ԫ��û�У����᷵���䰴˳��Ӧ�ò���λ�õ�������
	public static int halfSearch(int[] arr,int x){
		int min = 0;
		int max = arr.length-1;
		int mid = (min+max)/2;
		while(min<=max){
			if(x>arr[mid]){
				min = mid+1;
			}else if(x<arr[mid]){
				max = mid-1;
			}else{
				return mid;
			}
			mid = (min+max)/2;
		}
		return min;
	}
}

	