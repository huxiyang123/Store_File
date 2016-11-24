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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			try {
				if (rea != null)
					rea.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}

	// ���·ݺ;ٰ�����ھ����ֱ���Ϊ��ֵ�Դ���HashMap��
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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		compare(map);
	}

	// ����BufferedReader������readline����������Itarator�����Ƚ�¼��������map�еļ��Ƿ����
	public static void compare(Map map) {
		BufferedReader br1 = null;
		BufferedWriter bw1 = null;
		System.out.println("��������ݣ�");
		try {
			br1 = new BufferedReader(new InputStreamReader(System.in));
			bw1 = new BufferedWriter(new OutputStreamWriter(System.out));
			String stri = null;
			while ((stri = br1.readLine()) != null) {
				if ("no".equals(stri)) {
					bw1.write("���β�ѯ�ѽ������������ѯ���������С���ллʹ�ã�");
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
							bw1.write("��������������ݣ�\n�˳�������no��");
							bw1.newLine();
							bw1.flush();
							break;
						}
					}
					if (flag) {
						bw1.write(stri + "û�оٰ����籭����");
						bw1.newLine();
						bw1.flush();
						bw1.write("��������������ݣ�\n�˳�������no��");
						bw1.newLine();
						bw1.flush();
					}
				}
			}
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			try {
				if(bw1!=null)
					bw1.close();
				if (br1 != null)
					br1.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}

	}
	

}
