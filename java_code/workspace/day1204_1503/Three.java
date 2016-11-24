/*
三元运算符
boolean类型的表达式或结果？true：false

*/
public class Three{
  public static void main(String[] args){
    int scorc = 60;
    String result = scorc>=80?"奖励100元":(scorc>=60?"奖励60":"二");
    System.out.println(result);
  }

}