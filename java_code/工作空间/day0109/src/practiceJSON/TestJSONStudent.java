package practiceJSON;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import StudyJSON.Student;

import net.sf.json.JSONObject;


public class TestJSONStudent {

	public static void main(String[] args) {
		String jsonStr = "{cName:'Android1503',cRoom:'01',student:[{sid:1,sname:'zhangsan'},{sid:2,sname:'lisi'}]}";
		
		Grade grade = new Grade();
		List<Student> list = new ArrayList<>();
		JSONObject jo = JSONObject.fromObject(jsonStr);
		//根据key获取value
		String cName = (String)jo.get("cName");
		grade.setcName(cName);
		String cRoom = jo.getString("cRoom");
		grade.setcRoom(cRoom);
		//用迭代器遍历
		Iterator<JSONObject> it = jo.getJSONArray("student").iterator();
		while(it.hasNext()){
			JSONObject job = (JSONObject) it.next();
			Student st = (Student) JSONObject.toBean(job,Student.class);
			list.add(st);
		}
		grade.setStudent(list);
		System.out.println(grade);
		
		//用for循环遍历
//		JSONArray js = jo.getJSONArray("student");	
//		
//		for(int i=0;i<js.size();i++){
//			System.out.println(22);
//			JSONObject obj = (JSONObject)js.get(i);
//			list.add((Student)JSONObject.toBean(obj,Student.class));
//		}
//		grade.setStudent(list);
//		System.out.println(grade);
		
	}

}
