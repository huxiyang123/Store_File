package Decorator;

public abstract class Decorator implements Hamburger{
	private Hamburger ham;
	
	public Decorator(Hamburger ham){
		this.ham = ham;
	}
	
	public void produce(){
		doBefore();
		ham.produce();
		doAfter();
		
	}

	public abstract void doBefore();
	public abstract void doAfter();
}
