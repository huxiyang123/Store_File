package Review;
/*
 * ����ģʽ��
 * 	1 ˽�л�private���캯�����ⲿ����ʵ����
 * 	2 ����һ���������������󸶸����������ʹ��static final���Σ�finalĿ�������ò��ɱ䣬
 * 		static��������Ϊstatic������������������
 * 	3 ����һ��static�ķ���������ǰ�涨��ı�����static����Ϊ�ⲿ�޷�ͨ���������
 * 
 */
public class SingleMedol {
	//����ģʽ
	private  static final SingleMedol sm = new SingleMedol();
	private SingleMedol(){
		
	}
	public static SingleMedol getInstance(){
		return sm;
			
	}
}
