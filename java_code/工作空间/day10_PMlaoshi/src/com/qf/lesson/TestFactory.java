package com.qf.lesson;

public class TestFactory {

	public static void main(String[] args) {
		Man man = ManFactory.getMan("ch");
        Man man2 = ManFactory.getMan("ch");
        System.out.println(man==man2);
        
        Man man3 = ManFactory.getMan("am");
        Man man4 = ManFactory.getMan("am");    
        
	}

}
