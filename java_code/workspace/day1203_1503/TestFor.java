/*
ѭ����䣺����ĳ�������£��ظ�ִ���ض��������䡣
   1 for��� 
      for(��ʼ��������������䣻������ݼ�����){
	 �ظ�ִ�д��롣  
      }
      ����:
       1) �����ĳ�ʼ����ִ��һ�Ρ�
       2��ִ��������䣬Ϊtrue�Ļ���ִ��ѭ������䣬ִ�в���3��Ϊfalse���˳�ѭ���壻
       3�������ĵ�����ݼ�������
       4������ִ�в���2
   2 while���:��while���������Ϊtrue�ǣ���һֱִ��ѭ����䡣
       while(boolean���ʽ�����){
 	ѭ������䣻
	}
   3 do...while
*/


public class TestFor{
  static int sum2;//����������Բ���ʼ����ϵͳĬ�ϡ����Բ���ʾ��ʼ��
  public static void main(String[] args){
    for(int i=1;i<=100;i++){
	int j = i%2;
        if(j==0){
	System.out.print(i+" ");
        }
    }
    double sum = 1;  //ʹ��ǰ�����ʼ�������򱨴�
    for(int i=1;i<=50;i++){
        sum = i*sum;   
    }
	System.out.println("1��100��ji:"+sum);
	System.out.println();

    int i = 1, j = 0;
    while(i<=100){
      if (i%4==0){
      System.out.println("4����:"+i);
	j+=i;
      }
      i++;
    }
    System.out.println("4������ :"+j);
  }
}














