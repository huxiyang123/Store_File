package homework;


public class Person {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void openDoor(IceBox ib){
		System.out.print(name+"��");
		ib.open();
	}
	public void catchInto(Elephant e){
		e.walkInto();
	}
	public void closeDoor(IceBox ib){
		System.out.print(name+"�ر�");
		ib.close();
	}
}

