/*
�������:����ĳ�������Ż�ִ�е���䡣
   ���ࣺ
    1 if:
      1)if(boolean���͵ı��ʽ��ֵ){
     	   ��������ִ�е����
        }
      2��if(boolean���͵ı��ʽ��ֵ){
     	   ��������ִ�е����
         }
         else{
	    ���������������
       	 }
      3��if(boolean���͵ı��ʽ��ֵ){
     	   ��������ִ�е����
         }
         else if(){
     	   ��������ִ�е����
         }
         else{
	    ���������������
       	 }
    2 switch{
      
  	}


*/
public class TestIf{
  public static void main(String[] args){
    int scorc = 50;
    if(scorc>=60){
    	System.out.println("����60Ԫ");
    }else
	System.out.println(-60);
    int scorc2 = 110;
    if (scorc2>=80){
      	System.out.println("����");
    }
    else if(scorc2>=60){
	System.out.println("����");
    }else if(scorc2<60&&scorc2>=0){
      	System.out.println("������");
  	}
        else{
	  System.out.println("���ӸĴ���");
 	}
    if(scorc2>=60){
      if(scorc2<=80){
      	System.out.println("����80");
      }
      else if(scorc2==100){
      	System.out.println("����200");
      }
      else if(scorc2<100){
      	System.out.println("����100");
      }
      else{
 	System.out.println("���Ӵ���");
      }
     
    }
    else{
    	System.out.println("������");
    }    
  }

}