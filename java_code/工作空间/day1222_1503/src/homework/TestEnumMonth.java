package homework;

/*
 * 1 自定义枚举类Month，包含12个月份的名称和描述信息。
 编写方法,传入Month类型参数，然后输入月份信息。
 */
public class TestEnumMonth {

	public static void main(String[] args) {
		getInformation(EnumMonth.APRIL );
	}

	public static void getInformation(EnumMonth em) {
		switch (em) {
		case JANUARY:
			System.out.println("一月");
			break;
		case FEBRUARY:
			System.out.println("二月");
			break;
		case MARCH:
			System.out.println("三月");
			break;
		case APRIL:
			System.out.println("四月");
			break;
		case MAY:
			System.out.println("五月");
			break;
		case JUNE:
			System.out.println("六月");
			break;
		case JULY:
			System.out.println("七月");
			break;
		case AUGUST:
			System.out.println("八月");
			break;
		case SEPTEMBER:
			System.out.println("九月");
			break;
		case OCTOBER:
			System.out.println("十月");
			break;
		case NOVEMBER:
			System.out.println("十一月");
			break;
		case DECEMBER:
			System.out.println("十二月");
			break;
		default:
			System.out.println("你是外星人呢。。。。");

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