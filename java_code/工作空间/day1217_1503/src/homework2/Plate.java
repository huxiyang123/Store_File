package homework2;

public class Plate {
	private String plate;

	public Plate(String plate) {
		super();
		this.plate = plate;
	}

	@Override
	public String toString() {
		return "Plate [plate=" + plate + "]";
	}
	public static void main(String[] args) {
		Cabinet<Plate> list1 = new Cabinet<Plate>();
		for(int i=1;i<10;i++){
			Plate pl = new Plate("dish"+i);
			list1.add(pl);
		}
		for(int j=1;j<10;j++){
			System.out.println(list1.getDish());			
		}
	}
}
