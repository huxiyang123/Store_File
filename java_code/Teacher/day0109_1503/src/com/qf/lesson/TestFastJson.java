package com.qf.lesson;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

/*
 * FastJson：Alibaba公司出品
 *   步骤：
 *     1 使用JSONObject的parseObject()或者parseArray()，传入json字符串和映射类     
 */
public class TestFastJson {

	public static void main(String[] args) {
		//简单的json
		String jsonStr  ="{sid:1,sname:'zhangsan'}";
		Student s = JSONObject.parseObject(jsonStr, Student.class);
        System.out.println(s);
        
        //稍复杂的jsonstr
        String jsonStr2 = "[{sid:'1',sname:'zhangsan'},{sid:'2',sname:'lisi'}]";
        List<Student> list = JSONObject.parseArray(jsonStr2,Student.class);
        for(Student st:list){
        	System.out.println(st);
        }
        
        //
        String jsonStr3 ="{cName:'Android1503',cRoom:'01',studetns:[{sid:1,sname:'zhangsan'},{sid:2,sname:'lisi'}]}";
        MyClass my = JSONObject.parseObject(jsonStr3, MyClass.class);
        System.out.println(my);       
	}

}
