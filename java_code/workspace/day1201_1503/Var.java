/*
*java中变量的定义和使用
*变量：程序执行中数值可变的数据
*     变量名：定义变量的表示符
*     变量值：内存单元中所装载的数据
*数据类型：
*    1,基本数据类型；
	1）数值型：
	    a 整形：\
		byte：一个字节(8位)，范围：-128~127
		short:两个字节（16位），范围-32768~32767（2^15-2^15-1）
		int:四个字节（32位），范围约-21亿~21亿
		long：八个字节（64位）,必须添加L或l标示。  
	    b 浮点型：
		float:单精度，四个字节，必须添加F或f
		double：双精度，8个字节，小数的默认类型
		  如果需要精确的小数位，可以使用
	2）字符型：char 0~65535；每一个char都有一个Unicode（全球语言统一编码）
		     char a=‘a’；
		     char a=97；
	3）布尔型：
		  Boolean，取值为true或者false
     2，引用数据类型；
	1)类class；String字符串就是class类型
	2)接口interface
	3)数组

*/
public class Var{
  public static void main(String[] args){
    byte age=25;
	System.out.println("去年："+age);
    byte age2=127;   //byte 范围：-128~127
	System.out.println("今年："+age2);
    short age3=-32768;
	System.out.println("平均薪资1:"+age3);
    int account=32768;
	System.out.println("平均薪资2："+account);
    long account2=2176588888L;
	System.out.println("平均薪资3:"+account2);

    //小数的声明
    float price;
    price=12.3f;
    System.out.println("current price:"+price);
    price=3.12f;
    System.out.println("current price:"+price);
    double price2=3.14;
    System.out.println("current price2:"+price2);

    //char字符
    char ch='a';
    char  h=97;   //char的两种表现形式
    System.out.println(ch+1+"hello");//打印出98hello
    System.out.println("hello"+ch+1);//打印出helloa1
    System.out.println(h);
    char c='\'';
    System.out.println(c+"\\\\");

    //boolean类型
    Boolean flag=true;
    System.out.println(flag);
    flag=true;
  System.out.println('*'+"     "+1 +'\r'+2+3);


	     System.out.print("  *\t *\n");
	    System.out.print("*  *love*  *\n");
	    System.out.print(" *    *   *\n");
	    System.out.println("   *    *");
	    System.out.println("      *");
	
	
	
	
   }
}