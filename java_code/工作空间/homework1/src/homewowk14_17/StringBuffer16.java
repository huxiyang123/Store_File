package homewowk14_17;
/*
 * 3 �����ɾ���ͼ�εĴ��룬����StringBuffer�С�Ȼ���ӡ����.
 */
public class StringBuffer16 {
	public static void main(String[] args) {
		int n=5,m=7;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		StringBuffer sb = new StringBuffer();
		sb.append("\tint n=5,m=7;\n");
		sb.append("\tfor(int i=0;i<n;i++){\n");
		sb.append("\t\tfor(int j=0;j<m;j++){\n");
		sb.append("\t\t\tSystem.out.print(\"*\");\n");
		sb.append("\t\t}\n");
		sb.append("\t\tSystem.out.println();\n");
		sb.append("\t}");
		 
		System.out.println(sb);
	}
}
