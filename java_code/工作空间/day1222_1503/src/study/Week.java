package study;

public enum Week {
	MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期天");
	private String name ;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Week(String name) {
		this.name = name;
	}
	public void say(){
		System.out.println("星期名："+name);
	}
	
}
