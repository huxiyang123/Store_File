/*
Switch��֧��䣬��ĳЩ�����£����Ժ�if������
  �﷨��
    switch��������{
       case ������
      	  ��Ҫִ�е���䣻
	  break��
	����
       [
	default������ѡ��
 	    Ĭ��ִ����䣻
       ]
    }  
  ע�⣺
	1 ����������������int char short byte��
	   Ҳ������String�ַ�������
 	2 case������������γ������ַ�������
	3 default�ǿ�ѡ��
	4 break������ִ����һ��case��֧��ʹ��������switch����

*/

public class TestSwitch{
  public static void main(String[] args){
    int scorc = 50;
    int a = scorc/10;
    switch(scorc){
       case 10:
       case 20:
       case 30:
       case 40:
       case 50:
	System.out.println("������");
	break;
       case 60:
       case 70:
       case 80:
      	System.out.println("����80");
	break;
       case 90:
       case 100:
       	System.out.println("����100");
	break;
       default:
    	System.out.println("����");
    }


    String s = "һ";
    switch(s){
       case "һ":
	System.out.println("����һ");
  	break;
       case "��":
	System.out.println("���ڶ�");
 	break;
       case "��":
	System.out.println("������");
 	break;
       case "��":
	System.out.println("������");
	break;
       case "��":
	System.out.println("������");
	break;
       case "��":
	System.out.println("������");
	break;
       case "��":
	System.out.println("������");
	break;
       default:
    	System.out.println("����");
     }
  }
}




















