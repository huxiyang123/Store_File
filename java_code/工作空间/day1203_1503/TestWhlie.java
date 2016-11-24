 /*
 while语句:当while后面的条件为true是，会一直执行循环语句。
       while(boolean表达式或变量){
 	循环体语句；
	}
*/
public class TestFor{
   int sum2;//类变量，可以不初始化，系统默认。可以不显示初始化
  public static void main(String[] args){
    int i = 1, j = 0;
    while(i<=100){
      if (i%4==0){
      System.out.println("4整除:"+i);
	j+=i;
      }
      i++;
    }
    System.out.println("4整除和 :"+j);
  }
}