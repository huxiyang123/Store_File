/*
    do...while:��ִ��һ�Σ�Ȼ���ж�while���������Ƿ������Ϊtrue����ѭ����Ϊfalse��ֹ��
   �﷨��
    do{
      ѭ�����

    }while��boolean���͵ı�������ʽ����
   ��ע��while������Ҫһ���ֺŶ
*/

public class TestDoWhile{
   int sum2;//����������Բ���ʼ����ϵͳĬ�ϡ����Բ���ʾ��ʼ��
  public static void main(String[] args){

    int i = 0;
    while(i>100){
      System.out.println("4������ :"+i);
    }
/////do...while
    do{
      System.out.println("do...while�е�i :"+i);
    }while(i>100);
   
/*
 ���׳��ܼ���

*/
   int j = 0;
   while(i<=10000){
     if(i%1000==0) {
       System.out.println("��"+j+"һǧ�ס�");
       j++;
     }
     i++;
   }
   for(;i<10000;i++){
     if(i%1000==0){
   	System.out.println("��"+j+"һǧ��le��");
       	 j++;
     }
   }
  }
}