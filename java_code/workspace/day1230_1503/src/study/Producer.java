package study;
/*
 * 生产者线程：
 * 	生产商品
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
