/*
循环语句：满足某种条件下，重复执行特定代码的语句。
   1 for语句 
      for(初始化变量；条件语句；递增或递减操作){
	 重复执行代码。  
      }
      步骤:
       1) 变量的初始化仅执行一次。
       2）执行条件语句，为true的话则执行循环体语句，执行步骤3；为false则退出循环体；
       3）变量的递增或递减操作；
       4）继续执行步骤2
   2 while语句:当while后面的条件为true是，会一直执行循环语句。
       while(boolean表达式或变量){
 	循环体语句；
	}
   3 do...while
*/


public class TestFor{
  static int sum2;//类变量，可以不初始化，系统默认。可以不显示初始化
  public static void main(String[] args){
    for(int i=1;i<=100;i++){
	int j = i%2;
        if(j==0){
	System.out.print(i+" ");
        }
    }
    double sum = 1;  //使用前必须初始化，否则报错
    for(int i=1;i<=50;i++){
        sum = i*sum;   
    }
	System.out.println("1到100的ji:"+sum);
	System.out.println();

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














