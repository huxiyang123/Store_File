package Review;

public class TestSon {
	public static void main(String[] args) {
		Manager p = new Father();
		Son s = new Son(p);
		s.walkLong();
	}
}
