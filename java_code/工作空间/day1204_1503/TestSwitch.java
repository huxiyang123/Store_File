/*
Switch分支语句，在某些条件下，可以和if互换。
  语法：
    switch（变量）{
       case 常量：
      	  需要执行的语句；
	  break；
	……
       [
	default：（可选）
 	    默认执行语句；
       ]
    }  
  注意：
	1 变量是整数可以是int char short byte。
	   也可以是String字符串类型
 	2 case后面必须是整形常量或字符串常量
	3 default是可选的
	4 break用来在执行完一个case分支后使程序跳出switch语句块

*/

public class TestSwitch{
  public static void main(String[] args){
    int scorc = 50;
    int a = scorc/10;
    switch(scorc){
       case 10:
       case 20:
       case 30:
       case 40:
       case 50:
	System.out.println("不及格");
	break;
       case 60:
       case 70:
       case 80:
      	System.out.println("奖励80");
	break;
       case 90:
       case 100:
       	System.out.println("奖励100");
	break;
       default:
    	System.out.println("出错");
    }


    String s = "一";
    switch(s){
       case "一":
	System.out.println("星期一");
  	break;
       case "二":
	System.out.println("星期二");
 	break;
       case "三":
	System.out.println("星期三");
 	break;
       case "四":
	System.out.println("星期四");
	break;
       case "五":
	System.out.println("星期五");
	break;
       case "六":
	System.out.println("星期六");
	break;
       case "日":
	System.out.println("星期日");
	break;
       default:
    	System.out.println("出错");
     }
  }
}




















