package homework1;
/*
 * 1 给定字符串：str="sunjavaandroidjavajavasejavaeejavamec#java.netjavaphpjava",
 * 编写程序，统计字符串"java"出现的次数。
 */
public class TestFind {

	public static void main(String[] args) {
		String str="sunjavaandroidjavajavasejavaeejavamec#java.netjavaphpjava";

		int j=0;
		int y = str.lastIndexOf("java");
		for(;;){
			if(y>0){
				y = str.lastIndexOf("java",--y);
				j++;
			}
			else{
				break;
			}
		}
		System.out.println("在str中Java共出现："+j+" 次");
	}
}
