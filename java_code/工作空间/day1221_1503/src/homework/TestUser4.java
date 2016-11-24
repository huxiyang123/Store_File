package homework;


import java.util.HashMap;
import java.util.HashSet;


import java.util.Map;
import java.util.Set;

/*
 * 4 创建包含多个性别不同的User对象的HashSet集合。
 * 使用HashMap统计男生女生的数量
 */
public class TestUser4 {

	public static void main(String[] args) {
		Set<User> set4 = new HashSet<User>();
		set4.add(new User("张三","男"));
		set4.add(new User("王华","女"));
		set4.add(new User("白胜","男"));
		set4.add(new User("马强","男"));
		set4.add(new User("李晓","女"));
		set4.add(new User("赵荣","女"));
		set4.add(new User("李娜","女"));
		Map<String, Integer> map = new HashMap<String, Integer>();
	
		int i=1;
		for(User u:set4){
			if(map.containsKey(u.getSex())){
				map.put("男", ++i);
				
			}else{
				map.put("男", i);
			}
			System.out.println(u);
		}
		System.out.println("男："+i+"女："+(set4.size()-i));
	
	}

}
