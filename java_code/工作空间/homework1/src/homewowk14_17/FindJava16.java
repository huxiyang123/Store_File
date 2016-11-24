package homewowk14_17;
/*
1 给定字符串：str="sunjavaandroidjavajavasejavaeejavamec#java.netjavaphpjava",
 * 编写程序，统计字符串"java"出现的次数。
 */
public class FindJava16 {
	public static void main(String[] args) {
		String str = "sunjavaandroidjavajavasejavaeejavamec#java.netjavaphpjava";
		int j=0,s=1;
		for(;;){
			if(s<1){
				break;
			}
			s = str.indexOf("java",s+1);
				j++;
		}
		System.out.println(j-1);
	}
}
