package homework1;

public class Customer {



	public static void main(String[] args) {
		MyQueue<Car>  outerDoor = new MyQueue<Car>();
		//ģ��ͣ�������ڳ��Ŷ�
		for(int i=1;i<11;i++){
			Car c = new Car("name"+i,"colour"+i);
			outerDoor.add(c);
		}
		for(int j=1;j<11;j++){
			System.out.println(outerDoor.get());
		}

	}

}
