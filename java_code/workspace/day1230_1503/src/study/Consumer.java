package study;

public class Consumer extends Thread {
	//����������
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
