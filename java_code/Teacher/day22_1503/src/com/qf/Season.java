package com.qf;

public enum Season {
	END,SPRING("春天","春意盎然"), SUMMER("夏天","烈日炎炎"), AUTUMN("秋天","秋意浓浓"), WINTER("冬天","大雪纷飞"),START;

	private String name;
	private String desc;

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private Season(){
		
	}
	
	private Season(String name,String desc){
		this.name = name;
		this.desc =desc;
	}
	
	public void display(){
		System.out.println("季节名:"+name+"；简介:"+desc);
	}

}
