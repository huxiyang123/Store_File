package homework;

public class TestPerson {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("����");
		IceBox p1 = new IceBox();
		p1.name = "����";
		Elephant p2 = new Elephant();
		p2.name = "����";
		p.openDoor(p1);
		p.catchInto(p2);
		p.closeDoor(p1);
		
	
		
		
	}

}
