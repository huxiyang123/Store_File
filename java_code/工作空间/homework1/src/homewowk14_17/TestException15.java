package homewowk14_17;
/*
 * 	1  ����һ��Student�࣬���Է����Զ��塣 ����һ��������TestStudent������һ������test()��
 * �ڷ����ж���һ��Student���͵����ñ�������ָ����һ�������ҳ�ʼ��Ϊnull��
    Ȼ��������ñ����ķ�����
	2  ��TestStudent�е�main�����е���test(),�۲���������ԭ��
	3  ʹ���Զ����쳣�����������⡣
 */
public class TestException15 {

	public static void main(String[] args) {
		try {
			test();
		} catch (StudentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	public static void test() throws StudentException{
		Student stu = null;
		if(stu==null){
			throw new StudentException("stuΪ�գ��޷����ö�Ӧ�ķ�����");
		}
		stu.say();
	}

}
class Student{
	public void say(){
		System.out.println("����һ��ƽ����");
	}
}
class StudentException extends Exception{
	StudentException(String message){
		super(message);
	}
}
