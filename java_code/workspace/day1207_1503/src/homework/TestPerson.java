package homework;

public class TestPerson {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("张三");
		IceBox p1 = new IceBox();
		p1.name = "海尔";
		Elephant p2 = new Elephant();
		p2.name = "非洲";
		p.openDoor(p1);
		p.catchInto(p2);
		p.closeDoor(p1);
		
	
		
		
	}

}
