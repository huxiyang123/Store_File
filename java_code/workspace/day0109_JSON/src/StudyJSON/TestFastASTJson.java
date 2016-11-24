package StudyJSON;

import java.util.List;

import practiceJSON.Grade;

import com.alibaba.fastjson.JSONObject;

/*
 * FastJson:Alibaba��˾
 * 	���裺
 * 		1 ʹ��JSONObject��parseObject()����parseArray()������json�ַ�����ӳ����
 */
public class TestFastASTJson {
	public static void main(String[] args) {
//============�򵥵�FastJSON��������=============================

		String jsonStr = "{sid:1,sname:'zhangsan'}";
		Student  s = JSONObject.parseObject(jsonStr,Student.class);
		System.out.println(s);

//==========�ϸ��ӵ�FastJSON��������=====================================================
		String jsonStr2 = "[{sid:1,sname:'zhangsan'},{sid:2,sname:'lisi'}]";
		List<Student> list = JSONObject.parseArray(jsonStr2,Student.class);
		for(Student st:list){
			System.out.println(st);
		}
//========���ӵ�FastJSON����=============================================
		String jsonStr3 = "{student:[{sid:1,sname:'zhangsan'},{sid:2,sname:'lisi'}]}";
		Grade gr = JSONObject.parseObject(jsonStr3, Grade.class);
				System.out.println("����GSON=="+gr);
	}
}