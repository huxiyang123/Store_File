/*
  �������͵�ת��:��boolean���ͳ��⣩
   1 С��Χ������ת��Ϊ��Χ���������� ���Զ�����������
	byte char short==>int==>long==>float==>double
   2 ��Χ������ת��ΪС��Χ���������� ��ǿ������ת����
	��������  ������ = ���������ͣ�����

*/

public class Change{
  public static void main(String[] args){
    byte a=127;
    System.out.println(a+3);
    byte b=1;
    System.out.println(a+b);
    //����c������byte������ʱa��b�Զ�ת��λint
    int c=a+b;
    System.out.println(c);
    char d='d';
   int e=d+a;
    long t=1L;
    long f = e+t;
    float g = 1.0F;
    float h = g+f;
    double k = h+1.23;
    System.out.println('��'+1); //��ӡ���Unicodeֵ
    
    //ǿ������ת��    
    double  j = 128.56;
    int m = (int)j;
    System.out.println(m);
    byte i = (byte)m;
    System.out.println(i);

    System.out.println('*');



















  }

}