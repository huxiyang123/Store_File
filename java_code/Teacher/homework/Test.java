package homework;

public class Test {

	public static void main(String[] args) {
		IceBox ib  = new IceBox();
		ib.setName("容声");

		People  p = new People();
		p.setName("zhangsan");
		p.open(ib);
	}

}
