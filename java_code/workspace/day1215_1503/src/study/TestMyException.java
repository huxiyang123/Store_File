package study;

public class TestMyException {
	public static void main(String[] args) {
		
		try {
			divide(3,2);
		} catch (CustomException e) {
			e.dispalyError();
			e.printStackTrace();
			System.out.println("lfjslj");
		}
	}
	public static void divide(int x,int y) throws CustomException{
		int result=0;
		try{
			result = x/y;
		}catch(Exception e){
			throw new CustomException("��ĸ����Ϊ��");
		}
		System.out.println(result);
		
	}
}
