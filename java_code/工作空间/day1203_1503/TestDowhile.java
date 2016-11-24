/*
    do...while:先执行一次，然后判断while后面条件是否成立，为true继续循环，为false终止。
   语法：
    do{
      循环语句

    }while（boolean类型的变量或表达式）；
   备注：while后面需要一个分号额；
*/

public class TestDoWhile{
   int sum2;//类变量，可以不初始化，系统默认。可以不显示初始化
  public static void main(String[] args){

    int i = 0;
    while(i>100){
      System.out.println("4整除和 :"+i);
    }
/////do...while
    do{
      System.out.println("do...while中的i :"+i);
    }while(i>100);
   
/*
 万米长跑计数

*/
   int j = 0;
   while(i<=10000){
     if(i%1000==0) {
       System.out.println("第"+j+"一千米。");
       j++;
     }
     i++;
   }
   for(;i<10000;i++){
     if(i%1000==0){
   	System.out.println("第"+j+"一千米le。");
       	 j++;
     }
   }
  }
}