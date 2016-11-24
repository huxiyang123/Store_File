package com.qf.lesson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class ElectMonitorTest
{

	public static void main(String[] args)
	{
		List<Student> list = new ArrayList<Student>();
		TreeMap<Integer, Integer> tempMap = new TreeMap<Integer, Integer>();

		init(tempMap, list);
		electMonitor(tempMap, list);

	}
	
	private static void electMonitor(TreeMap<Integer, Integer> tempMap,List<Student> list){
		System.out.println("----班长选举现在结束----");
		System.out.println(tempMap);
		int count = Collections.max(tempMap.values());
		if (tempMap.containsValue(count))
		{
			for (int num : tempMap.keySet())
			{
				if (tempMap.get(num).equals(count))
				{
					for (Student stu : list)
					{
						if (stu.getStuNo() == num)
						{
							System.out.println("本次班长的人选是：" + stu.getName());
							break;
						}
					}
					break;
				}
			}
		}
	}

	private static void init(TreeMap<Integer, Integer> tempMap, List<Student> list)
	{
		Scanner scanner = null;
		try
		{
			int i = 0;
			int count = 1;
			scanner = new Scanner(System.in);

			Pattern p = getPattern(list);

			System.out.println("----班长选举现在开始----");
			
			System.out.println("请投票：");

			while (i++ < 10)
			{
				do
				{
					System.out.println("第" + i + "个同学投票：");
					String str = scanner.next();
					if (!p.matcher(str).matches())
					{
						System.out.println("按键错误，请重新选择！");
						continue;
					}
					int num = Integer.valueOf(str);
					if (tempMap.containsKey(num))
					{
						count = tempMap.get(num);
						count++;
					}
					tempMap.put(num, count);
					break;
				}
				while (true);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			scanner.close();
		}
	}

	private static Pattern getPattern(List<Student> list)
	{

		list.add(Student.DIRENJIE);
		list.add(Student.LIYUANFANG);
		list.add(Student.ZENGTAI);

		StringBuilder reg = new StringBuilder("");

		for (Student s : list)
		{
			reg.append(s.getStuNo()).append("|");
			System.out.println(s);
		}

		String regx = reg.toString().substring(0, reg.toString().length() - 1); //1|2|3
		return Pattern.compile(regx);
	}

}

enum Student
{
	DIRENJIE("狄仁杰", 1), LIYUANFANG("李元芳", 2), ZENGTAI("曾泰", 3);

	private String name;
	private int stuNo;

	private Student(String name, int stuNo)
	{
		this.name = name;
		this.stuNo = stuNo;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getStuNo()
	{
		return stuNo;
	}

	public void setStuNo(int stuNo)
	{
		this.stuNo = stuNo;
	}

	@Override
	public String toString()
	{
		return "姓名：" + this.name + ",学号：" + this.stuNo;
	}

}