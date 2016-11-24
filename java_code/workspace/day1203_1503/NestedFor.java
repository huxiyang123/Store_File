/*
嵌套的for循环
   语法:
     for(boolean类型的变量或表达式){
        for(boolean类型的变量或表达式){
	  循环体。
        }
     }
例：九九乘法表
    步骤：
     	1 外循环打印行数
	2 内循环负责打印算式
	
*/
 public class NestedFor{
  public static void main(String[] args){
   //九九乘法表1
     int n=10;
     
     for(int i=1;i<n;i++){
	
	for(int j=1;j<i+1;j++){
	   int sum = i*j;
	   System.out.print(j+"*"+i+"="+sum);
	   //控制算式后面的空格，使其每个算式对齐。
	   if(sum>9){
	      System.out.print(" ");
	   }
	   else{
	      System.out.print("  ");
  	   }
	}
	System.out.println();			
     }

    //倒九九乘法表2
     for(int i=9;i>0;i--){
	for(int j=1;j<i+1;j++){
	   int sum = i*j;
	   System.out.print(j+"*"+i+"="+sum);
	   //控制算式后面的空格，使其每个算式对齐。
	   if(sum>9){
	      System.out.print(" ");
	   }
	   else{
	      System.out.print("  ");
  	   }
	}
	System.out.println();			
     }
//倒三角3
     for(int i=9;i>0;i--){
	for(int k=i;k<n-1;k++){
	   System.out.print("       ");
 	}
	for(int j=i;j>0;j--){
	   int sum = i*j;
	   System.out.print(j+"*"+i+"="+sum);
	   //控制算式后面的空格，使其每个算式对齐。
	  if(sum>9){
	      System.out.print(" ");
	   }
	   else{
	      System.out.print("  ");
  	   }
	}
	System.out.println();			
     }
//倒三角4
     for(int i=1;i<n;i++){
	for(int k=n-i-1;k>0;k--){
	   System.out.print("       ");
 	}
	for(int j=i;j>0;j--){
	   int sum = i*j;
	   System.out.print(j+"*"+i+"="+sum);
	   //控制算式后面的空格，使其每个算式对齐。
	   if(sum>9){
	      System.out.print(" ");
	   }
	   else{
	      System.out.print("  ");
  	   }
	}
	System.out.println();			
     }
  }
}