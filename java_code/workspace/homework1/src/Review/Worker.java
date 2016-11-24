package Review;

public class Worker {
	private Company b;

	public Worker(Company c) {
		super();
		this.b = c;
	}
	
	public void getInstence(){
		b.start();
		for(int i=0;i<10;i++){
			System.out.println("正在工作；；；；");
		}
		System.out.println("工作已完成，，，，");
		b.message();
	}
}
