package study;
/*
 * �������̣߳�
 * 	������Ʒ
 */

public class Producer extends Thread {
	private Shelf shelf;

	public Producer(Shelf shelf) {
		
		this.shelf = shelf;
	}

	@Override
	public void run() {
		while(true){
			shelf.addProduct();
		}
	}
}
