package homework1;


public class Car {
	private String name;
	private String colour;


	public Car(String name, String colour) {
		super();
		this.name = name;
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", colour=" + colour + "]";
	}


	public static void main(String[] args) {
		MyStack<Car>  carStop = new MyStack<Car>();
		for(int i=1;i<11;i++){
			Car car = new Car("name"+i,"colour"+i);
			carStop.add(car);
		}
		for(int j=1;j<11;j++){
			System.out.println(carStop.get());
		}
	}
}
