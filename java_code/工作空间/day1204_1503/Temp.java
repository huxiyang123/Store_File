/*假设 石头是1，剪刀是2，布是3.
 1 自己出一个数字you。
 2 计算机出一个：
      int c=(int)(Math.random()*3+1);
*/
public class Temp{
  public static void main(String[] args){
    int my = 2;
    int computer = (int)(Math.random()*3+1);
    int b = my-computer;
   //if方法
    if(b==0){
    	System.out.println("平局，重来");
    }
    else if(b<0){
      if(b==-1){
	System.out.println("我赢");
      }
      else{
	System.out.println("我输");
      }

    }
    else if(b==1){
	  System.out.println("我输");
    }
    else{
	  System.out.println("我赢"); 
        }
   //switch方法  
   switch(b){
      case 0:
        System.out.println("平局，重来");
	break;
      case 1:
      case -2:
	System.out.println("我输");
	break;
      case 2:
      case -1:
	System.out.println("我赢");
	break;
      default:
   } 
  }
}
