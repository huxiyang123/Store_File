/*
java 中操作符的使用
  分类：
    1 算术运算符：对数值类型的变量或常量进行操作
	+ 、 - 、 * 、 / 、 % 、 ++ 、 --
    2 赋值运算符：= 、 += 、 -= 、 *= 、 /= 、 %=
    3 关系运算符：> 、 < 、 >= 、 <= 、 == 、 !=
       ==比较运算符：比较基本数据类型值是否相等，比较引用数据类型的引用地址是否相等
    4 逻辑运算符：结果为Boolean类型的表达式或boolean类型的值。
      ! 、 & 、 | 、 ^ 、 && 、 ||
    5 位运算符：& 、 | 、 ^ 、 ~ 、 >> 、 << 、 >>>
    6 字符串连接运算符：+
*/
public class Operate{
  public static void main(String[ ] args){
    int i = 10; 
    System.out.println(i+12);
    System.out.println("取余："+i%3);
    System.out.println(i+++"\n");  //相当于i=i+1
     int j = i++;
    System.out.println(j);
    System.out.println(i+"\n");  
    
    int m = 10,n = ++m;
    System.out.println(n);
    System.out.println(m+"\n");  //相当于m=m+1
   
    int a = 10,b = a--;
    System.out.println(b);  //先把变量的值付给表达式，再减1
    System.out.println(a+"\n");  //相当于a=a-1
    
    int k = 10,h = -- k;
    System.out.println(h);  //先减1，在把变量的值付给表达式
    System.out.println(k+"\n");  //相当于k=k-1

    int x = 10,y = 1,z;
    z = (x++)+(++x)+(y--)+(--y);
    System.out.println(x+"\t"+y+"\t"+z);

    int a1 = 10;
    a1 += 3;  
    System.out.println(a1+"\n");  
    
    boolean f = 2>4;
     
    System.out.println(f); 
 
    //boolean flag = (2=4); 报错
    Boolean flag = 2==4;
    System.out.println(flag+"\n"); 
    boolean flag1 = (2!=4);
    System.out.println(flag1+"\n");

    int flag2 = a1*=4;
    System.out.println(flag2);

    int flag3 = (a1%=3);
    System.out.println(flag3+"\n");


    }
}