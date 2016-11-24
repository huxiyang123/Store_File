package homework;

public class GetMax {

	public static void main(String[] args) {
		GetMax.compare(4, 9, 1);

	}
	/*
	 * 比较3个数的大小
	 *   思路：
	 *     1 第一个和第二个比较，大于第二个则交换
	 *     2 第一个和第三个比较，大于第三个则交换。此步骤结束则第一个一定是最小的了。
	 *     3 第二个和第三个继续比较，大于第三个则交换。此步骤结束则第二个一定是较小的，第三个是最大的了
	 */
	public static void  compare(int a,int b,int c){
		int temp = 0;//定义一个临时变量作为保存数据的容器
		//先用第一个和第二个进行比较：a比b大则交换，否则不变。
		if(a>b){
			temp = a;
			a = b;
			b = temp;
		}
		//第一个和第三个进行比较:a比c小则交换，否则不变。注意此时的a可能是被交换过的值了
		if(a>c){
			temp = a;
			a = c;
			c = temp;
		}
		//第二个和第三个进行比较:b比c小则交换，否则不变。注意此时的b和c可能都是被交换过的值
		if(b>c){
			temp = b;
			b = c;
			c = temp;
		}
		System.out.println(a+"--"+b+"--"+c);
	}

}
