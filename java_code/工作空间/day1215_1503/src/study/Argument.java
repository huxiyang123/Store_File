package study;
/*
 * �ɱ������
 *   ���ó����� ���������У�����������ͬ����������������ͬ
 *   �﷨����������... �β���
 *   ʹ�ã�
 *       ���԰��βε������鿴����ʹ��for��forEach����ʹ��.
 *       ���˿ɱ�����⣬���������������ɱ�������������һ����
 *   �ŵ㣺
 *     ���ٴ����д��
 * �����в�����main�������ݵĲ���
 *  dos���ڣ�����ʹ�ÿո�ֿ�
 *  eclispe:run Configuration: ����ʹ�ÿո�ֿ� 
 */
public class Argument {

	public static void main(String[] args) {
//		Argument a = new Argument();
//		a.play("name");
//		System.out.println("=========");
//		a.play("name", "passwor");
//		System.out.println("=========");
//		a.play("na", "pa", "type");
//		System.out.println("=========");
//        a.play("aa","bb","cc","dd","ff","ee");
		for(String s:args){
			System.out.println(s);
		}
	}

//	public void play(String name) {
//
//	}
//
//	public void play(String name, String password) {
//
//	}
//
//	public void play(String name, String password, String type) {
//
//	}
	//JDK1.7�Ժ�
	public void play(String... names){
		for(String n:names){
			System.out.println(n);
		}
	}

}
