/*
条件语句:满足某种条件才会执行的语句。
   分类：
    1 if:
      1)if(boolean类型的表达式或值){
     	   满足条件执行的语句
        }
      2）if(boolean类型的表达式或值){
     	   满足条件执行的语句
         }
         else{
	    不满足条件的语句
       	 }
      3）if(boolean类型的表达式或值){
     	   满足条件执行的语句
         }
         else if(){
     	   满足条件执行的语句
         }
         else{
	    不满足条件的语句
       	 }
    2 switch{
      
  	}


*/
public class TestIf{
  public static void main(String[] args){
    int scorc = 50;
    if(scorc>=60){
    	System.out.println("奖励60元");
    }else
	System.out.println(-60);
    int scorc2 = 110;
    if (scorc2>=80){
      	System.out.println("优秀");
    }
    else if(scorc2>=60){
	System.out.println("及格");
    }else if(scorc2<60&&scorc2>=0){
      	System.out.println("不及格");
  	}
        else{
	  System.out.println("卷子改错了");
 	}
    if(scorc2>=60){
      if(scorc2<=80){
      	System.out.println("奖励80");
      }
      else if(scorc2==100){
      	System.out.println("奖励200");
      }
      else if(scorc2<100){
      	System.out.println("奖励100");
      }
      else{
 	System.out.println("卷子错了");
      }
     
    }
    else{
    	System.out.println("不及格");
    }    
  }

}