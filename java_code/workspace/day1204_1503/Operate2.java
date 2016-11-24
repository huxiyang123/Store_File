/*
   逻辑运算符：结果为Boolean类型的表达式或boolean类型的值。 ! 、 & 、 | 、 ^ 、 && 、 ||
   !  取反
   &  逻辑与，两个都为true结果才是true，否则都是false
   |  逻辑或，两个都为false，则为false否则是true
   ^  异或   一真一假为true，都是true或false为false
  &&  短路与，当第一个为false，则第二个不进行比较，结果为false，优先使用
  ||  短路或，当第一个为true，则第二不进行比较，结果为true，优先使用
  链接运算符：和字符串结合使用
    +：把相关的
 
    

*/
public class Operate2{
  public static void main(String[] args){

    //！逻辑非
    boolean flag = 2>4;
    System.out.println(!flag);
    System.out.println(!true);
    //&逻辑与
    boolean flag1 = 2>4;
    boolean flag2 = 4>3;
    System.out.println(flag1&flag2);
    System.out.println(true&true);
    //|逻辑或
    
    System.out.println(flag1|flag2);
    System.out.println(true|true);

    System.out.println();
    //^异或
    System.out.println(flag1^flag2);
    System.out.println(true^true);
    //&&或|| 短路与  效率更高
    System.out.println(flag1&&flag2);
    System.out.println(true&&true);

    // +：连接符
    String s = "boolean";
    //char c = '\t';
    System.out.println(flag1+s+'\t'+s);
   // System.out.println(false+'a'+10+s);
    
  }

}