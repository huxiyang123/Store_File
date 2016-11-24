package homework22;
/*
 * 1 自定义枚举类Month，包含12个月份的名称和描述信息。
  编写方法,传入Month类型参数，然后输入月份信息。
 */
public enum EnumMonth {
	JANUARY("一    月","元旦节"),FEBRUARY("二    月","情人节"),MARCH("三    月","植树节"),
	APRIL("四    月","愚人节"),MAY("五    月","劳动节"),JUNE("六    月","儿童节"),
	JULY("七    月","建党节"),AUGUST("八    月","建军节"),SEPTEMBER("九    月","教师节"),
	OCTOBER("十    月","国庆节"),NOVEMBER("十一月","光棍节"),DECEMBER("十二月","圣诞节");
	
	private String name;
	private String festival;
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return information
	 */
	public String getFestival() {
		return festival;
	}
	

	private EnumMonth(String name, String festival) {
		this.name = name;
		this.festival = festival;
	}
	public void display(){
		System.out.println("月份："+name+"------节日："+festival);
	}

}
