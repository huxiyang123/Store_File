package Review.ReviewClass;


/*
 * ��ĳ�ʼ��˳��
 *   1 û��ʹ��extends�ؼ��֣�
 *     1)���Ƚ���static�����ʹ����ĳ�ʼ������������˳���������ȼ��ء�
 *     2)Ȼ����г�Ա�����ĳ�ʼ������������˳���������ȼ��ء�
 *     3)���췽���ĳ�ʼ���� 
 *   2 �̳нṹ��ʼ����
 *     1) �̳���ϵ�����о�̬��Ա��ʼ��,�ȸ���,������.
       2) ���๹������ʼ����ɣ���ͨ��Ա�ĳ�ʼ��-->���캯���ĵ���) 
       3) ���๹������ʼ������ͨ��Ա-->���캯����
 */
public class Chinese extends Parent{
   private int age = 19;
   
   private static String country = "�й�";
  
   static{
	   System.out.println("������: "+country);
	   System.out.println("��̬������ʼ��������");
   }
  
   
   public Chinese(int sAge) {
	 super("test");
	 System.out.println("Ĭ�����䣺"+age);
	 System.out.println("���췽����ʼ��!!!!");
	 this.age = sAge;
	 System.out.println("ʵ������:"+age);
   }
   
   static{
	   System.out.println("��̬�����111");
   }
}
