/*���� ʯͷ��1��������2������3.
 1 �Լ���һ������you��
 2 �������һ����
      int c=(int)(Math.random()*3+1);
*/
public class Temp{
  public static void main(String[] args){
    int my = 2;
    int computer = (int)(Math.random()*3+1);
    int b = my-computer;
   //if����
    if(b==0){
    	System.out.println("ƽ�֣�����");
    }
    else if(b<0){
      if(b==-1){
	System.out.println("��Ӯ");
      }
      else{
	System.out.println("����");
      }

    }
    else if(b==1){
	  System.out.println("����");
    }
    else{
	  System.out.println("��Ӯ"); 
        }
   //switch����  
   switch(b){
      case 0:
        System.out.println("ƽ�֣�����");
	break;
      case 1:
      case -2:
	System.out.println("����");
	break;
      case 2:
      case -1:
	System.out.println("��Ӯ");
	break;
      default:
   } 
  }
}
