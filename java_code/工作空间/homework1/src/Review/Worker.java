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
			System.out.println("���ڹ�����������");
		}
		System.out.println("��������ɣ�������");
		b.message();
	}
}
