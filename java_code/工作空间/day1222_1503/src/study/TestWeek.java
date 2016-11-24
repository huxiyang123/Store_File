package study;

public class TestWeek {

	public static void main(String[] args) {
		display(Week.TUESDAY);
	}
	public static void display(Week w){
		//Week w = Week.MONDAY;
		switch(w){
		case MONDAY:
			System.out.println("春暖花开");
			break;
		case TUESDAY:
			System.out.println("生如夏花");
			break ;
		case WEDNESDAY:
			System.out.println("秋高气爽");
			break ;
		case THURSDAY:
			System.out.println("寒风凌厉");
			break ;
		case FRIDAY:
			System.out.println("寒风凌厉");
			break ;
		case SATURDAY:
			System.out.println("寒风凌厉");
			break ;
		case SUNDAY:
			System.out.println("寒风凌厉");
			break ;
			default:
				System.out.println("不知道");
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
