package homewowk14_17;
/*
1 �����ַ�����str="sunjavaandroidjavajavasejavaeejavamec#java.netjavaphpjava",
 * ��д����ͳ���ַ���"java"���ֵĴ�����
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
