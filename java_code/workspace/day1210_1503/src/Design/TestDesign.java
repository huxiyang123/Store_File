package Design;

public class TestDesign {
	public static void main(String[] args) {
		Design d = Design.getInstance();
		d.display();
		Design d1 = Design.getInstance();
		d1.display();
		System.out.println(d==d1);
		
		DesignPattern dp = DesignPattern.getInstance();
		dp.play();
		DesignPattern dp1 = DesignPattern.getInstance();
		dp.play();
		System.out.println(dp==dp1);
	}
}
