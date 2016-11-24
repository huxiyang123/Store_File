package study;
/*
 * 枚举：enum
 * 	  对象数量有限个数。
 */
public class TestEnum {

	public static void main(String[] args) {
		Season s = Season.SPRING;
		switch(s){
		case SPRING:
			System.out.println("春暖花开");
			break;
		case SUMMER:
			System.out.println("生如夏花");
			break ;
		case AUTUMN:
			System.out.println("秋高气爽");
			break ;
		case WINTER:
			System.out.println("寒风凌厉");
			break ;
			default:
				System.out.println("不知道");
		}
		s.display();
		Season[] ss = Season.values();
		for(Season t:ss){
			t.display();
		}
		System.out.println("===========================");
		Season t = Season.valueOf("SPRING");
		System.out.println(t);
		t.display();
		

	}

}
