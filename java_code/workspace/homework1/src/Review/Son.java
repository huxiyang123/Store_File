package Review;
/*
 * ��������
 */
public class Son {
	private Manager p;
	
	public Son(Manager p) {
		
		this.p = p;
	}

	public void walkLong(){
		for(int i=0;i<10;i++){
			System.out.println("��·��");
		}
		System.out.println("���ѵ����������");
		p.sondMessage();
	}
}
