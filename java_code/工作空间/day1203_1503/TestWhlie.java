 /*
 while���:��while���������Ϊtrue�ǣ���һֱִ��ѭ����䡣
       while(boolean���ʽ�����){
 	ѭ������䣻
	}
*/
public class TestFor{
   int sum2;//����������Բ���ʼ����ϵͳĬ�ϡ����Բ���ʾ��ʼ��
  public static void main(String[] args){
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