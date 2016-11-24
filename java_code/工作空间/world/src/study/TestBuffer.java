package study;

/*
 * 3 将生成矩形图形的代码，存入StringBuffer中。然后打印出来.
 */
public class TestBuffer {
	int longShape(int n, int m) {
		int x = 0;
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < m; i++) {
				System.out.print("*");
			}
			System.out.print("\n");
			x++;
		}
		return x;
	}

	public static void main(String[] args) {
		TestBuffer ol = new TestBuffer();
		ol.longShape(5, 6);

		StringBuffer sb = new StringBuffer();
		sb.append("int longShape(int n, int m) {\n");
		sb.append("\tint x = 0;\n");
		sb.append("\tfor (int j = 0; j < n; j++) {\n");
		sb.append("\t\tfor (int i = 0; i < m; i++) {\n");
		sb.append("\t\t\tSystem.out.print(\"*\");\n");
		sb.append("\t\t}\n");
		sb.append("\t\tSystem.out.print(\"\\n\");\n");
		sb.append("\t\tx++;\n");
		sb.append("\t}\n");
		sb.append("\treturn x;\n");
		sb.append("}");

		System.out.println(sb);
	}
}