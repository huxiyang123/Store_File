/*
�д󵱻飬Ů�󵱼ޡ�Ů���ҳ������������ 1.7������7000��˧���ǡ�
���ͬʱ���㣬�� "һ����";
�����һ�����㣬��"�ްɣ����ϲ����������";
�������㣬�� "����"

*/
public class Operson{
  public static void main(String[] args){
    float h = 1.7F;
    int m = 7000;
    String s = "��";
    float H = 1.8F;
    int  M = 7000;
    String S = "��";
    if(H>=h&&M>=m&&S==s){
      	System.out.println("һ����");
		
    }
    else if(h>=H&&m>=M&&s!=S){
	System.out.println("����");
    }
    else{
	System.out.println("�ްɣ����ϲ����������");
    }
    
    char c = 'e';
    switch(c){
    	case 'a':
	  System.out.println("A");
	  break;
	case 'b':
	  System.out.println("B");
	  break;
  	case 'c':
	  System.out.println("C");
	  break;
	case 'd':
	  System.out.println("D");
	  break;
 	case 'e':
	  System.out.println("E");
	  break;
	default:
	  System.out.println("other");
	  break;
    }

    String b = "ʮһ";
    switch(b){
    	case "һ":
	case "��":
  	case "��":
	  System.out.println("����");
	  break;
	case "��":
	case "��":
  	case "��":
	  System.out.println("�ļ�");
	  break;
 	case "��":
	case "��":
  	case "��":
	  System.out.println("�＾");
	  break;
	case "ʮ":
	case "ʮһ":
  	case "ʮ��":
	  System.out.println("����");
	  break;
	default:
	  System.out.println("����");
	  break;
    }

  }
}