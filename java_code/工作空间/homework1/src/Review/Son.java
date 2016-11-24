package Review;
/*
 * 被调用者
 */
public class Son {
	private Manager p;
	
	public Son(Manager p) {
		
		this.p = p;
	}

	public void walkLong(){
		for(int i=0;i<10;i++){
			System.out.println("在路上");
		}
		System.out.println("我已到达。。。。。");
		p.sondMessage();
	}
}
