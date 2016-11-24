package exercise;
/*
 *工厂模式
 */
public class ToolPrinter {
	public static Factory method(int i){
		Factory fact = null;
		if(i==0){
			fact = new HPPrinter();
			return fact;
		}
		else if(i==1){
			fact = new CanonPrinter();	
			return fact;
		}
		return fact;
	}
}
