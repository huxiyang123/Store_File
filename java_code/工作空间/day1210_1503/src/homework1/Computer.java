package homework1;

public class Computer {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void plugIn(USB u){
		System.out.println(name+" 已插入USB接口！！！");
		u.start();
		for(int i=0;i<3;i++){
			work();
		}
		u.end();
	}
	public void work() {
		System.out.println("正在工作！！！！！");
	}	
}
