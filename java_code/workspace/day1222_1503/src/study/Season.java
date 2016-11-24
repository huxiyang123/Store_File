package study;

public enum Season {
	SPRING("春天","春风拂面"),SUMMER("夏天","烈日炎炎"),AUTUMN("秋天","秋意浓浓"),WINTER("冬天","大雪纷飞");
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
		System.out.println("季节名："+name+"  简介："+desc);
	}
}
