package homework22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class SelectMethod {
	public static void selectMethod(int number) {
		
		Scanner in = new Scanner(System.in);
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, j = 0;

		Map<Student, Integer> map = new HashMap<Student, Integer>();
		Student stu1 = new Student("����", 1);
		Student stu2 = new Student("����", 2);
		Student stu3 = new Student("����", 3);
		Student stu4 = new Student("����", 4);
		Student stu5 = new Student("����", 5);
		Student stu6 = new Student("����", 6);
		map.put(stu1, a);
		map.put(stu2, b);
		map.put(stu3, c);
		map.put(stu4, d);
		map.put(stu5, e);
		map.put(stu6, f);

		
		for (;;) {
			System.out.println("������ѡ���˵�ѧ��,��Χ��1-6����");
			int num = in.nextInt();

			// Pattern p = Pattern.compile("[1-6]");
			// Matcher m = p.matcher("num");
			// System.out.println(m.matches());
			if (num > 0 && num < 7) {
				if (stu1.getNumber() == num) {
					map.put(stu1, ++a);

				} else if (stu2.getNumber() == num) {
					map.put(stu2, ++b);
				} else if (stu3.getNumber() == num) {
					map.put(stu3, ++c);
				} else if (stu4.getNumber() == num) {
					map.put(stu4, ++d);
				} else if (stu5.getNumber() == num) {
					map.put(stu5, ++e);
				} else {
					map.put(stu6, ++f);
				}
				j++;
				if (j == number) {
					break;
				}
			} else {
				System.out.println("���벻�Ϸ������������룺");

			}
		}

		List<Map.Entry<Student, Integer>> list = new ArrayList<Entry<Student, Integer>>();
		list.addAll(map.entrySet());
		Collections.sort(list, new CustomComparator() {
			public int compare(Entry<Student, Integer> o1,
					Entry<Student, Integer> o2) {

				return o2.getValue() - o1.getValue();
			}
		});
		Iterator<Map.Entry<Student, Integer>> it = list.iterator();
		System.out.println("��������λ��ѡ�˵�Ʊ�����");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		String name = list.get(0).getKey().getName();
		int poll = list.get(0).getValue();
		System.out.println(name + "��" + poll + "Ʊ����һ����ѡΪ�೤�����һ�ӭ   " + name
				+ "  ��̨����ѡ���ԣ�����");
	}
}
