package com.qf.lesson;

public class ManFactory {
   public static Man  getMan(String type){
	   if(type.equals("ch")){
		   return new Chinese();
	   }
	   else if(type.equals("am")){
		   return new American();
	   }
	   else{
		   System.out.println("type有误！！！！！");
		   return null;
	   }
   }
}
