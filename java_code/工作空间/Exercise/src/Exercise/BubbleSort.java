package Exercise;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 1, 8, 78, 4, 23, 12 };
		System.out.println("排序前：");
		print(arr);
		
		bubbleSort(arr);
		System.out.println("冒泡排序：");	
		print(arr);
		int index = halfSearch(arr,8);
		System.out.println("index="+index);
		
		selectSort(arr);
		System.out.println("选择排序：");
		print(arr);
		int index1 = halfSearch(arr,9);
		System.out.println("index="+index1);
	}
	//选择排序
	public static void selectSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					swap(arr,i,j);
				}
			}
		}
	}

	// bubble冒泡排序
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr,j,j+1);
				}
			}
		}
	}
	//数组交换位置
	public static void swap(int[] arr,int a,int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	//打印数组
	public static void print(int[] arr){
		for (int d : arr) {
			System.out.print(d + " ");
		}
		System.out.println();
	}
	//使用折半查找,返回对应的索引，如果需要查找的元素没有，将会返回其按顺序应该插入位置的索引。
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

	