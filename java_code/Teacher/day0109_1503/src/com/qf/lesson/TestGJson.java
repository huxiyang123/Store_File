package com.qf.lesson;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
/*
 * GSon:Google公司开发
 *   使用步骤：
 *    1  初始化Gson对象
 *    2  调用Gson对象的fromJson()方法，需要出入JSON字符串或JsonElement对象
 *    3  使用返回的java类
 */
public class TestGJson {

	public static void main(String[] args) {
		//简单的json
		String jsonStr  ="{sid:1,sname:'zhangsan'}";
		Gson gson = new Gson();
		Student s =gson.fromJson(jsonStr, Student.class);
		//JsonObject jo = JsonObject.
        System.out.println(s);
        
        //稍复杂的jsonstr
        String jsonStr2 = "[{sid:'1',sname:'zhangsan'},{sid:'2',sname:'lisi'}]";
        //解析器
        JsonParser parser = new JsonParser();
        List<Student> list = new ArrayList<Student>();
        //解析为JsonElement对象，对应于外层的[]
        JsonElement element= parser.parse(jsonStr2);
        if(element.isJsonArray()){
        	//把上面的JsonElement对象转换为JsonArray
        	JsonArray object= element.getAsJsonArray();        	
        	for(JsonElement jo:object){
        		//对JsonElement转换为java对象
        		list.add(gson.fromJson(jo, Student.class));
        	}
        }
        for(Student st:list){
        	System.out.println(st);
        }
        
      
        
        //稍复杂的jsonstr        
        String jsonStr3 ="{studetns:[{sid:1,sname:'zhangsan'},{sid:2,sname:'lisi'}]}";
        MyClass mc = gson.fromJson(jsonStr3, MyClass.class);
        System.out.println("***************"+mc);
	}

}
