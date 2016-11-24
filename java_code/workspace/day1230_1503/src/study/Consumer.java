package study;

public class Consumer extends Thread {
	//共享数据区
	private Shelf shelf;
	public Consumer(Shelf shelf) {
	
		this.shelf = shelf;
	}
	@Override
	public void run() {
		while(true){
			shelf.condsumeProduct();
		}
	}
}
