package homework;

/*
 * 1 �Զ���ö����Month������12���·ݵ����ƺ�������Ϣ��
 ��д����,����Month���Ͳ�����Ȼ�������·���Ϣ��
 */
public class TestEnumMonth {

	public static void main(String[] args) {
		getInformation(EnumMonth.APRIL );
	}

	public static void getInformation(EnumMonth em) {
		switch (em) {
		case JANUARY:
			System.out.println("һ��");
			break;
		case FEBRUARY:
			System.out.println("����");
			break;
		case MARCH:
			System.out.println("����");
			break;
		case APRIL:
			System.out.println("����");
			break;
		case MAY:
			System.out.println("����");
			break;
		case JUNE:
			System.out.println("����");
			break;
		case JULY:
			System.out.println("����");
			break;
		case AUGUST:
			System.out.println("����");
			break;
		case SEPTEMBER:
			System.out.println("����");
			break;
		case OCTOBER:
			System.out.println("ʮ��");
			break;
		case NOVEMBER:
			System.out.println("ʮһ��");
			break;
		case DECEMBER:
			System.out.println("ʮ����");
			break;
		default:
			System.out.println("�����������ء�������");

		}
		em.display();
		EnumMonth[]  eMonth = EnumMonth.values();
		for(EnumMonth e:eMonth){
			e.display();
		}
		EnumMonth  en = EnumMonth.valueOf("MAY");
		en.display();
	}
}