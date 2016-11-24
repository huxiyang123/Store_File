package com.qf.lesson;

public class Util {
	//通过接口实现不同类别的对象可以调用共同的方法
   public static void useCommon(Mover m){
	   m.move();
	   m.say();
   }
   
   //同一父类的不同实现类可以调用共同的方法
   public static void useCommon2(FatherRobot r ){
	  r.operate();
	  r.power();
   }
}
