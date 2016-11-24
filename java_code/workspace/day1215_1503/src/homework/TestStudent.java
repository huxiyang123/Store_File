package homework;

public class TestStudent {
	public static void main(String[] args) {	
			try {
				test();
			} catch (CustomException e) {
				System.out.println(e.getMessage()+e.toString());
				e.displayError();
				
				e.printStackTrace();
			}
			finally{

				Student stu = new Student();
				stu.say();
			}
	}
	public static void test() throws CustomException{
		Student stu = null;
		if(stu==null)
			throw new CustomException("¥ÌŒÛ–≈œ¢!!!");
				stu.say();
			
				
				
	}
}
