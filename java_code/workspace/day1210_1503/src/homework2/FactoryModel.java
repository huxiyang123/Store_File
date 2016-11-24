package homework2;

public class FactoryModel {
	public static void getProduce(String s){
		Computer c = new Computer();
		Factory fact =null;
		
		if(s.equals("º¸≈Ã")){
			
			fact = c.new Keyboard();		
			Tool.method(fact);
		
		}else if(s.equals(" Û±Í")){
			
			fact = c.new Mouse();
			Tool.method(fact);

		}else if(s.equals("ª˙œ‰")){
			
			fact = c.new Box();
			Tool.method(fact);		
		}	
	}
}
