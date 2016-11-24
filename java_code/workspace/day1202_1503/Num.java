import java.util.*;
public class Num{
  public static void main(String[] args){
  /*  Scanner in = new Scanner(System.in);
    System.out.println("请输入一个整数：");
    a = in.nextInt();
   */ 
    Num n = new Num();
    int result = n.getNum(1,100); 
    System.out.print("偶数共有："+result);
  }
   
  int getNum(int begin,int end){
    int count = 0;
    for(int i=begin;i<=end;i++){
      if(i%2==0){
        System.out.print(i+" ");
        count++;
      }
      if(count%10==0){
        System.out.println();
      }   
    }
    return count;
  }
}