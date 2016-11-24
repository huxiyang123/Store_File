package StudyJSON;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class TestJsonArray {

	public static void main(String[] args) {
		String jsonStr = "[{sid:1,sname:'zhangsan'},{sid:2,sname:'lisi'}]";
		List<Student> list = new ArrayList<>();
		JSONArray array = JSONArray.fromObject(jsonStr);
		for(int i=0;i<array.size();i++){
			JSONObject obj = (JSONObject)array.get(i);
			list.add((Student)JSONObject.toBean(obj,Student.class));
		}
		for(Student s:list){
			System.out.println(s);
		}
	}

}
