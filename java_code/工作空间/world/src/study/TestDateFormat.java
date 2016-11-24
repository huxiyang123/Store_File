package study;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * SimpleDateFormat ��һ���������Ի����йصķ�ʽ����ʽ���ͽ������ڵľ����ࡣ
 * 			��������и�ʽ�������� -> �ı������������ı� -> ���ڣ��͹淶����
 * 		format(Date date);
 * 		patse(String str):
 * 
 */
public class TestDateFormat {

	public static void main(String[] args) {
		Date d = new Date();
		//ת��
		DateFormat df = new SimpleDateFormat("y��+M�¡���d��  H:m:s  S");
		System.out.println(df.format(d));
		//����
		String past = "2015��+12�¡���16��  18:11:9  793";
		try {
			Date now2 = df.parse(past);
			System.out.println(d.after(now2));
		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}

}
