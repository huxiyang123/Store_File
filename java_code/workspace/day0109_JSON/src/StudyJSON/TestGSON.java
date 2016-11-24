package StudyJSON;

import java.util.ArrayList;
import java.util.List;

import practiceJSON.Grade;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
/*
 * Gson:Google��˾��
 * 	    ʹ�ò��裺
 * 		1 ��ʼ��Gson����
 * 		2 ����Gson�����fromJson()��������Ҫ����JSON�ַ�������JsonElement����
 * 		3 ʹ�÷��ص�Java��
 */
public class TestGSON {

	public static void main(String[] args) {
//============�򵥵�GSON��������=============================
		String jsonStr = "{sid:1,sname:'zhangsan'}";
		Gson gson = new Gson();
		Student s = gson.fromJson(jsonStr, Student.class);
		
		System.out.println("��GSON=="+s);
		
//==========�ϸ��ӵ�GSON��������=====================================================
		String jsonStr2 = "[{sid:1,sname:'zhangsan'},{sid:2,sname:'lisi'}]";
		//
		JsonParser parser = new JsonParser();
		List<Student> list = new ArrayList<>();
		//����ΪJsonElement���󣬶�Ӧ����[]
		JsonElement element = parser.parse(jsonStr2);
		if(element.isJsonArray()){
			JsonArray object = element.getAsJsonArray();
			for(JsonElement jo:object){
				list.add(gson.fromJson(jo, Student.class));			
			}
		}
		for(Student st:list){
			
			System.out.println("�ϸ���GSON=="+st);
		}
//========���ӵ�GSON����=============================================
		String jsonStr3 = "{cName:'Android1503',cRoom:'01',student:[{sid:1,sname:'zhangsan'},{sid:2,sname:'lisi'}]}";
		Grade gr = gson.fromJson(jsonStr3, Grade.class);
		//gr.setStudent(list);
		System.out.println("����GSON=="+gr);
	}
}