/*
男大当婚，女大当嫁。女方家长提出条件：高 1.7，富：7000，帅：是。
如果同时满足，则 "一定嫁";
如果有一个满足，则"嫁吧，比上不足比下有余";
都不满足，则 "不嫁"

*/
public class Operson{
  public static void main(String[] args){
    float h = 1.7F;
    int m = 7000;
    String s = "是";
    float H = 1.8F;
    int  M = 7000;
    String S = "是";
    if(H>=h&&M>=m&&S==s){
      	System.out.println("一定嫁");
		
    }
    else if(h>=H&&m>=M&&s!=S){
	System.out.println("不嫁");
    }
    else{
	System.out.println("嫁吧，比上不足比下有余");
    }
    
    char c = 'e';
    switch(c){
    	case 'a':
	  System.out.println("A");
	  break;
	case 'b':
	  System.out.println("B");
	  break;
  	case 'c':
	  System.out.println("C");
	  break;
	case 'd':
	  System.out.println("D");
	  break;
 	case 'e':
	  System.out.println("E");
	  break;
	default:
	  System.out.println("other");
	  break;
    }

    String b = "十一";
    switch(b){
    	case "一":
	case "二":
  	case "三":
	  System.out.println("春季");
	  break;
	case "四":
	case "五":
  	case "六":
	  System.out.println("夏季");
	  break;
 	case "七":
	case "八":
  	case "九":
	  System.out.println("秋季");
	  break;
	case "十":
	case "十一":
  	case "十二":
	  System.out.println("冬季");
	  break;
	default:
	  System.out.println("出错");
	  break;
    }

  }
}