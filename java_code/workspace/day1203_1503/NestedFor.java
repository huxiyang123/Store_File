/*
Ƕ�׵�forѭ��
   �﷨:
     for(boolean���͵ı�������ʽ){
        for(boolean���͵ı�������ʽ){
	  ѭ���塣
        }
     }
�����žų˷���
    ���裺
     	1 ��ѭ����ӡ����
	2 ��ѭ�������ӡ��ʽ
	
*/
 public class NestedFor{
  public static void main(String[] args){
   //�žų˷���1
     int n=10;
     
     for(int i=1;i<n;i++){
	
	for(int j=1;j<i+1;j++){
	   int sum = i*j;
	   System.out.print(j+"*"+i+"="+sum);
	   //������ʽ����Ŀո�ʹ��ÿ����ʽ���롣
	   if(sum>9){
	      System.out.print(" ");
	   }
	   else{
	      System.out.print("  ");
  	   }
	}
	System.out.println();			
     }

    //���žų˷���2
     for(int i=9;i>0;i--){
	for(int j=1;j<i+1;j++){
	   int sum = i*j;
	   System.out.print(j+"*"+i+"="+sum);
	   //������ʽ����Ŀո�ʹ��ÿ����ʽ���롣
	   if(sum>9){
	      System.out.print(" ");
	   }
	   else{
	      System.out.print("  ");
  	   }
	}
	System.out.println();			
     }
//������3
     for(int i=9;i>0;i--){
	for(int k=i;k<n-1;k++){
	   System.out.print("       ");
 	}
	for(int j=i;j>0;j--){
	   int sum = i*j;
	   System.out.print(j+"*"+i+"="+sum);
	   //������ʽ����Ŀո�ʹ��ÿ����ʽ���롣
	  if(sum>9){
	      System.out.print(" ");
	   }
	   else{
	      System.out.print("  ");
  	   }
	}
	System.out.println();			
     }
//������4
     for(int i=1;i<n;i++){
	for(int k=n-i-1;k>0;k--){
	   System.out.print("       ");
 	}
	for(int j=i;j>0;j--){
	   int sum = i*j;
	   System.out.print(j+"*"+i+"="+sum);
	   //������ʽ����Ŀո�ʹ��ÿ����ʽ���롣
	   if(sum>9){
	      System.out.print(" ");
	   }
	   else{
	      System.out.print("  ");
  	   }
	}
	System.out.println();			
     }
  }
}