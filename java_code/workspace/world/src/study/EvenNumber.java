package study;

public class EvenNumber extends Thread {
	//共享数据区
	private BreakUp bu;
	public EvenNumber(BreakUp bu) {
	
		this.bu = bu;
	}
	@Override
	public void run() {
		while(true){
			bu.evenNumber();
		}
	}
}
