package study;

public enum Week {
	MONDAY("����һ"),TUESDAY("���ڶ�"),WEDNESDAY("������"),THURSDAY("������"),FRIDAY("������"),SATURDAY("������"),SUNDAY("������");
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
		System.out.println("��������"+name);
	}
	
}
