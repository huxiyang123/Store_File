package homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestWorldUp {
	public static void main(String[] args) {
		Reader rea = null;
		try {
			rea = new FileReader("message.txt");
			readFile(rea);
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			try {
				if (rea != null)
					rea.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

	// 将月份和举办国、冠军国分别作为键值对存如HashMap中
	public static void readFile(Reader file) {

		Map<String, String> map = new HashMap<>();

		BufferedReader br = null;
		try {
			br = new BufferedReader(file);
			String str = null;
			while ((str = br.readLine()) != null) {
				String[] array = str.split("   ");
				map.put(array[0], str.substring(7));
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		compare(map);
	}

	// 利用BufferedReader缓冲流readline方法，利用Itarator迭代比较录入的年份与map中的键是否相符
	public static void compare(Map map) {
		BufferedReader br1 = null;
		BufferedWriter bw1 = null;
		System.out.println("请输入年份：");
		try {
			br1 = new BufferedReader(new InputStreamReader(System.in));
			bw1 = new BufferedWriter(new OutputStreamWriter(System.out));
			String stri = null;
			while ((stri = br1.readLine()) != null) {
				if ("no".equals(stri)) {
					bw1.write("本次查询已结束，想继续查询请重新运行。。谢谢使用！");
					break;
				} else {
					boolean flag = true;
					Set<String> set = map.keySet();
					Iterator<String> it = set.iterator();
					while (it.hasNext()) {
						String s = it.next();
						if (stri.equals(s)) {
							bw1.write(map.get(s)+"\n");
							bw1.newLine();
							
							bw1.flush();
							flag = false;
							bw1.write("继续，请输入年份：\n退出，请输no：");
							bw1.newLine();
							bw1.flush();
							break;
						}
					}
					if (flag) {
						bw1.write(stri + "没有举办世界杯。。");
						bw1.newLine();
						bw1.flush();
						bw1.write("继续，请输入年份：\n退出，请输no：");
						bw1.newLine();
						bw1.flush();
					}
				}
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			try {
				if(bw1!=null)
					bw1.close();
				if (br1 != null)
					br1.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}

	}
	

}
