package com.qf.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<User> userList = new ArrayList<User>();
		for(int i=1;i<11;i++){			
			User u = new User("user"+i,"password"+i);
			userList.add(u);
		}
		for(User us:userList){
			System.out.println(us);
		}
		
		Iterator<User> it = userList.iterator();
        while(it.hasNext()){
        	System.out.println("=="+it.next());
        }
	}

}
