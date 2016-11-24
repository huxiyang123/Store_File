/*
嵌套的for循环
   语法:
     for(boolean类型的变量或表达式){
        for(boolean类型的变量或表达式){
	  循环体。
        }
     }
  
*/

public class Triangle{
  public static void main(String[] args){
    
/*
例：打印正三角形
    步骤：
     	1 外循环打印三角形的行数
	2 内循环负责打印*
	3 在步骤2之前并列内循环打印空格。
*/
     int n=5;
     String s = "*";
     for(int i=1;i<n;i++){
	for(int k=i;k<n-1;k++){
	   System.out.print(" ");
	}
	for(int j=0;j<i*2-1;j++){
	   System.out.print("*");
	}
	System.out.println();			
     }
     //倒三角形
     System.out.println("隔开");
     for(int i=1;i<n;i++){
	for(int k=n;k>n-i+1;k--){
	   System.out.print(" ");
	}
	for(int j=0;j<2*(n-i)-1;j++){
	   System.out.print("*");
	}
	
	System.out.println();			
     }
  }
}