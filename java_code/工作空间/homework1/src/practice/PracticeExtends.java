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
		static int j = 0;			//���ڲ���ĳ�Ա��static���κ���ô���ڲ���Ҳ����Ϊ��̬��
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
