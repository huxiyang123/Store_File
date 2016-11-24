package homewowk11;

public class Factory_Model {
	public static void method(String s){
		Computer1 c = new Computer1();
		Factory1 fact = null;
		if(s=="¼üÅÌ"){
			fact = c.new Keyboard1();
			fact.start();
			fact.end();
		}
		if(s=="»úÏä"){
			fact = c.new Box();
			fact.start();
			fact.end();
		}
		if(s=="Êó±ê"){
			fact = c.new Mouse1();
			fact.start();
			fact.end();
		}
	}
}
