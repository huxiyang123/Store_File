package homework3;

public class TestLineUp {
	private String person;

	@Override
	public String toString() {
		return "TestLineUp: [¹Ë¿Í£º" + person + "]";
	}

	public TestLineUp(String person) {
		super();
		this.person = person;
	}
	public static void main(String[] args) {
		Queue<TestLineUp> qu = new Queue<TestLineUp>();
		for(int i=1;i<9;i++){
			qu.add(new TestLineUp("person"+i));
		}
		for(int j=1;j<9;j++){
			System.out.println(qu.get());
		}
	}
}
