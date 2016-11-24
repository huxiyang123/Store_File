 /*
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
*/
import java.util.*;
public class Method{
  public static void main(String[] args){
    
    String s = "*";
    Scanner in = new Scanner(System.in);
    System.out.println("请输入一个整数:");
    int n = in.nextInt();

    Method m = new Method();
    m.say(n ,s);
    //System.out.print(t);
    
  }
  void say(int n,String s){
     for(int i=1;i<n;i++){
	for(int k=i;k<n-1;k++){
	  System.out.print( " ");
	}
	for(int j=0;j<i*2-1;j++){
	  System.out.print( s);
	}
	System.out.println();			
     }
     //return  "hu ";
  }
}