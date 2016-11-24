/*
break：通常使用在循环语句中：中断当前的循环或者在switch语句中：从当前的case子语句中跳出switch。
continue:通常使用在循环语句中：跳过档次循环，继续执行剩余的循环。
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