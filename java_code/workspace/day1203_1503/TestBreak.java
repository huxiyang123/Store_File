/*
break��ͨ��ʹ����ѭ������У��жϵ�ǰ��ѭ��������switch����У��ӵ�ǰ��case�����������switch��
continue:ͨ��ʹ����ѭ������У���������ѭ��������ִ��ʣ���ѭ����
*/

public class TestBreak{
  public static void main(String[] args){
    for(int i=0;i<50;i++){
      if(i==5){
        break;
      }
    System.out.println(i);
    }
    for(int i=0;i<50;i++){
      if(i%5==0){
        continue;
      }
    System.out.println(i);
    }
  }
}