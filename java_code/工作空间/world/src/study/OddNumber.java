package study;

public class OddNumber extends Thread {
	private BreakUp bu;

	public OddNumber(BreakUp bu) {
		
		this.bu = bu;
	}

	@Override
	public void run() {
		while(true){
			bu.oddNumber();
		}
	}
}
