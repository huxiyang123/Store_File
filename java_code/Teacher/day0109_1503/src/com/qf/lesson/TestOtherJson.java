package com.qf.lesson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




import net.sf.json.JSONObject;

/*
 * 解析稍复杂的JSON字符
 */
public class TestOtherJson {

	public static void main(String[] args) {
//		String jsonStr= "{studetns:[{sid:1,sname:'zhangsan'},{sid:2,sname:'lisi'}]}";
//		List<Student> list = new ArrayList<Student>();
//        JSONObject jo = JSONObject.fromObject(jsonStr);
//        for(Object o:jo.getJSONArray("studetns")){
//        	JSONObject obj = (JSONObject) o;
//        	Student s = (Student) JSONObject.toBean(obj,Student.class);
//        	list.add(s);
//        }
//        for(Student s:list){
//        	System.out.println(s);
//        }
//============================================
		String jsonStr= "{cName:'Android1503',cRoom:'01',studetns:[{sid:1,sname:'zhangsan'},{sid:2,sname:'lisi'}]}";
		MyClass m = new MyClass();
		List<Student> list = new ArrayList<Student>();
		JSONObject obj = JSONObject.fromObject(jsonStr);
		//根据key获取value
		String cName = (String) obj.get("cName");
		m.setcName(cName);
		String cRoom = obj.getString("cRoom");
		m.setcRoom(cRoom);
		
		
		Iterator it = obj.getJSONArray("studetns").iterator();
		while(it.hasNext()){
			JSONObject ob = (JSONObject) it.next();
			Student s = (Student) JSONObject.toBean(ob,Student.class);
			list.add(s);
		}
		m.setStudetns(list);
		
		System.out.println(m);
		
		
	}

}
