/*
  数据类型的转换:（boolean类型除外）
   1 小范围的类型转换为大范围的数据类型 （自动类型提升）
	byte char short==>int==>long==>float==>double
   2 大范围的类型转换为小范围的数据类型 （强制类型转换）
	数据类型  变量名 = （数据类型）变量

*/

public class Change{
  public static void main(String[] args){
    byte a=127;
    System.out.println(a+3);
    byte b=1;
    System.out.println(a+b);
    //这里c不能是byte，运算时a和b自动转换位int
    int c=a+b;
    System.out.println(c);
    char d='d';
   int e=d+a;
    long t=1L;
    long f = e+t;
    float g = 1.0F;
    float h = g+f;
    double k = h+1.23;
    System.out.println('国'+1); //打印输出Unicode值
    
    //强制类型转换    
    double  j = 128.56;
    int m = (int)j;
    System.out.println(m);
    byte i = (byte)m;
    System.out.println(i);

    System.out.println('*');



















  }

}