/*
*java�б����Ķ����ʹ��
*����������ִ������ֵ�ɱ������
*     ����������������ı�ʾ��
*     ����ֵ���ڴ浥Ԫ����װ�ص�����
*�������ͣ�
*    1,�����������ͣ�
	1����ֵ�ͣ�
	    a ���Σ�\
		byte��һ���ֽ�(8λ)����Χ��-128~127
		short:�����ֽڣ�16λ������Χ-32768~32767��2^15-2^15-1��
		int:�ĸ��ֽڣ�32λ������ΧԼ-21��~21��
		long���˸��ֽڣ�64λ��,�������L��l��ʾ��  
	    b �����ͣ�
		float:�����ȣ��ĸ��ֽڣ��������F��f
		double��˫���ȣ�8���ֽڣ�С����Ĭ������
		  �����Ҫ��ȷ��С��λ������ʹ��
	2���ַ��ͣ�char 0~65535��ÿһ��char����һ��Unicode��ȫ������ͳһ���룩
		     char a=��a����
		     char a=97��
	3�������ͣ�
		  Boolean��ȡֵΪtrue����false
     2�������������ͣ�
	1)��class��String�ַ�������class����
	2)�ӿ�interface
	3)����

*/
public class Var{
  public static void main(String[] args){
    byte age=25;
	System.out.println("ȥ�꣺"+age);
    byte age2=127;   //byte ��Χ��-128~127
	System.out.println("���꣺"+age2);
    short age3=-32768;
	System.out.println("ƽ��н��1:"+age3);
    int account=32768;
	System.out.println("ƽ��н��2��"+account);
    long account2=2176588888L;
	System.out.println("ƽ��н��3:"+account2);

    //С��������
    float price;
    price=12.3f;
    System.out.println("current price:"+price);
    price=3.12f;
    System.out.println("current price:"+price);
    double price2=3.14;
    System.out.println("current price2:"+price2);

    //char�ַ�
    char ch='a';
    char  h=97;   //char�����ֱ�����ʽ
    System.out.println(ch+1+"hello");//��ӡ��98hello
    System.out.println("hello"+ch+1);//��ӡ��helloa1
    System.out.println(h);
    char c='\'';
    System.out.println(c+"\\\\");

    //boolean����
    Boolean flag=true;
    System.out.println(flag);
    flag=true;
  System.out.println('*'+"     "+1 +'\r'+2+3);


	     System.out.print("  *\t *\n");
	    System.out.print("*  *love*  *\n");
	    System.out.print(" *    *   *\n");
	    System.out.println("   *    *");
	    System.out.println("      *");
	
	
	
	
   }
}