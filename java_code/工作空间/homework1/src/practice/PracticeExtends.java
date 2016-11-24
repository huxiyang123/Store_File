package practice;

class Fu{
	int i=0;
	public Fu(String f){
		System.out.println("g");
	}
	Fu(){
		System.out.println("b");
		i+=2;
	}
	static class Zi{
		static int j = 0;			//当内部类的成员被static修饰后，那么该内部类也必须为静态的
	}
}


public class PracticeExtends extends Fu{
	int i = 4;
		public PracticeExtends(String s){
			System.out.println("C");
			 i=5;
		}
	
	public static void main(String[] args) {
		
		Fu f = new PracticeExtends("a");
		System.out.println(f.i);
	}

}
