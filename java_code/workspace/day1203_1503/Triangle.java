/*
Ƕ�׵�forѭ��
   �﷨:
     for(boolean���͵ı�������ʽ){
        for(boolean���͵ı�������ʽ){
	  ѭ���塣
        }
     }
  
*/

public class Triangle{
  public static void main(String[] args){
    
/*
������ӡ��������
    ���裺
     	1 ��ѭ����ӡ�����ε�����
	2 ��ѭ�������ӡ*
	3 �ڲ���2֮ǰ������ѭ����ӡ�ո�
*/
     int n=5;
     String s = "*";
     for(int i=1;i<n;i++){
	for(int k=i;k<n-1;k++){
	   System.out.print(" ");
	}
	for(int j=0;j<i*2-1;j++){
	   System.out.print("*");
	}
	System.out.println();			
     }
     //��������
     System.out.println("����");
     for(int i=1;i<n;i++){
	for(int k=n;k>n-i+1;k--){
	   System.out.print(" ");
	}
	for(int j=0;j<2*(n-i)-1;j++){
	   System.out.print("*");
	}
	
	System.out.println();			
     }
  }
}