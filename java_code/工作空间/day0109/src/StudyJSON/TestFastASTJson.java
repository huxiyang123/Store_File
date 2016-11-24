package StudyJSON;

import java.util.List;

import practiceJSON.Grade;

import com.alibaba.fastjson.JSONObject;

/*
 * FastJson:Alibaba公司
 * 	步骤：
 * 		1 使用JSONObject的parseObject()或者parseArray()，传入json字符串和映射类
 */
public class TestFastASTJson {
	public static void main(String[] args) {
//============简单的FastJSON解析方法=============================

		String jsonStr = "{sid:1,sname:'zhangsan'}";
		Student  s = JSONObject.parseObject(jsonStr,Student.class);
		System.out.println(s);

//==========较复杂的FastJSON解析方法=====================================================
		String jsonStr2 = "[{sid:1,sname:'zhangsan'},{sid:2,sname:'lisi'}]";
		List<Student> list = JSONObject.parseArray(jsonStr2,Student.class);
		for(Student st:list){
			System.out.println(st);
		}
//========复杂的FastJSON解析=============================================
		String jsonStr3 = "{student:[{sid:1,sname:'zhangsan'},{sid:2,sname:'lisi'}]}";
		Grade gr = JSONObject.parseObject(jsonStr3, Grade.class);
				System.out.println("复杂GSON=="+gr);
	}
}
