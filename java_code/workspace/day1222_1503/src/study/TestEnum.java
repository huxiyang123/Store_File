package study;
/*
 * ö�٣�enum
 * 	  �����������޸�����
 */
public class TestEnum {

	public static void main(String[] args) {
		Season s = Season.SPRING;
		switch(s){
		case SPRING:
			System.out.println("��ů����");
			break;
		case SUMMER:
			System.out.println("�����Ļ�");
			break ;
		case AUTUMN:
			System.out.println("�����ˬ");
			break ;
		case WINTER:
			System.out.println("��������");
			break ;
			default:
				System.out.println("��֪��");
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
