package study;

public class TestWeek {

	public static void main(String[] args) {
		display(Week.TUESDAY);
	}
	public static void display(Week w){
		//Week w = Week.MONDAY;
		switch(w){
		case MONDAY:
			System.out.println("��ů����");
			break;
		case TUESDAY:
			System.out.println("�����Ļ�");
			break ;
		case WEDNESDAY:
			System.out.println("�����ˬ");
			break ;
		case THURSDAY:
			System.out.println("��������");
			break ;
		case FRIDAY:
			System.out.println("��������");
			break ;
		case SATURDAY:
			System.out.println("��������");
			break ;
		case SUNDAY:
			System.out.println("��������");
			break ;
			default:
				System.out.println("��֪��");
		}
		w.say();
		Week[] ss = Week.values();
		for(Week t:ss){
			t.say();
		}
		System.out.println("===========================");
		Week t = Week.valueOf("SATURDAY");
		t.say();

	}

}
