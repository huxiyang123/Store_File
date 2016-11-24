package homework1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;





public class User {
	private String name;
	private String password;
	
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}

	public static void main(String[] args) {
		List<User> userList = new ArrayList<User>();
		
		for(int i=1;i<11;i++){
			User u = new User("user"+i,"password"+i);
			userList.add(u);		
		}
		for(User us:userList){
			System.out.println(us);
		}
		System.out.println();
		Iterator<User> it = userList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
