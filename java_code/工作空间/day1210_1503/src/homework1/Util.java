package homework1;

public class Util {

	public static void common(USB u,String s){
		Computer c = new Computer();

		c.setName(s);
		c.plugIn(u);
	}
}
