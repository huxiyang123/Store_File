package homework1;
/*
 * 1 �����ַ�����str="sunjavaandroidjavajavasejavaeejavamec#java.netjavaphpjava",
 * ��д����ͳ���ַ���"java"���ֵĴ�����
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
		System.out.println("��str��Java�����֣�"+j+" ��");
	}
}
