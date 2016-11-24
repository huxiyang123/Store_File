package com.qf.lesson;

import net.sf.json.JSONObject;

/*
 * JSON:JavaScript Object Notation 是一种轻量级数据交换格式。
 *   可以表示的类型：
 *     1 对象：使用{}括起来的内容。例如：
 *       {name:'lisi',age:20}
 *       {students:[name:'zhangsan'],[name:'lisi']}
 *     2 数组:使用[]括起来的内容。例如：
 *       ["first","second","third"]
 * 解析方式：
 *   1 JSON:需要添加相应的jar包
 *     JSONObject：对应Json的对象
 *     JSONArray: 对应Json的数组
     
 *   2 GSON
 *   3 FASTJSON
 */
public class TestJson {

	public static void main(String[] args) {
		String jsonStr = "{sid:1,sname:'zhangsan'}";
		//把jsonStr字符串转换为JSONObject对象
        JSONObject jo = JSONObject.fromObject(jsonStr);
        //使用toBean()方法把JSONObject对象和java类的class对象关联
        Student s = (Student) JSONObject.toBean(jo, Student.class);
        System.out.println(s);
	}

}
