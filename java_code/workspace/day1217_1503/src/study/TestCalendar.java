package study;

import java.util.Calendar;
import java.util.Date;

/*
 * Calendar�����ࣺ�������������ڽ�����ز��������滻Date���
 * 	��ȡ����
 * 		1 Calendar.getInstance():����ʱ�������Ի�������Calendar���ڶ���
 * 		2 new GregorianCalendar();����һ�� GregorianCalendar����
 * ����:
 * 		1 add(int field, int amount):���������Ĺ���Ϊ�����������ֶ���ӻ��ȥָ����ʱ������
 * 		2 get(int field)��
 * 		3 getTimeInMillis():��ȡ��ǰʱ��ĺ�����
 * 		4 set(int field��int value)����ָ���ֶ�����
 */
public class TestCalendar {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, 3);
		System.out.println(c.getTime().toString());
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		System.out.println(c.getTimeInMillis());
		
		c.set(Calendar.YEAR, 2018);
		System.out.println(c.getTime());
		
		Date past = new Date(1045011219982L);
		c.setTime(past);	//����Ϊ�µ�����
		int year1 = c.get(Calendar.YEAR);
		System.out.println(year1);
		
	}
}
