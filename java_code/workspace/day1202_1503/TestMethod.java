public class TestMethod{  
   static double money;              
  public static void main(String[] args) {  
    TestMethod tm = new TestMethod();   
    long profit =5000000;
    Dog d = new Dog();
    d.jump();
    
    if(profit<400000){
      if(profit<100000){
        money =profit*0.1;
        System.out.println("money1:"+money); 
      }
      else if(profit<200000){
         money = tm.calculate2(profit);
         System.out.println("money2:"+money); 
      }
      else{
         money = tm.calculate3(profit);
         System.out.println("money3:"+money); 
      }
    }
    else{
      if(profit<600000){
         money = tm.calculate4(profit);
         System.out.println("money4:"+money);
      }
      else if(profit<1000000){
         money = tm.calculate5(profit);
         System.out.println("money5:"+money); 
      }
      else{
         money = tm.calculate6(profit);
         System.out.println("money6:"+money); 
      }
    }
  } 
  double calculate2(long x){
    money = (x-100000)*0.075+10000;
    return money;
  } 
  double calculate3(long x){
    money = calculate2( 200000)+(x-200000)*0.05;
    return money;
  }
  double calculate4(long x){
    money = calculate3(400000)+(x-400000)*0.03;
    return money;
  }
  double calculate5(long x){
    money = calculate4(600000)+(x-600000)*0.015;
    return money;
  } 
  double calculate6(long x){
    money = calculate5(1000000)+(x-1000000)*0.01;
    return money;
  }
}