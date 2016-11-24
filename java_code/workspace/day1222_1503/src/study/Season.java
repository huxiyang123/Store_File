package study;

public enum Season {
	SPRING("����","�������"),SUMMER("����","��������"),AUTUMN("����","����ŨŨ"),WINTER("����","��ѩ�׷�");
	private String name ;
	private String desc;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDesc() {
		return desc;
	}
	
	private Season(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	} 
	public void display(){
		System.out.println("��������"+name+"  ��飺"+desc);
	}
}
