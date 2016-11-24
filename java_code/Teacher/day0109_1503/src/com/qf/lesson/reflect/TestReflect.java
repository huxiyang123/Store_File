package com.qf.lesson.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.qf.lesson.Student;

/*
 * 反射：reflection.
 *   使用class文件产生类的对象。或者查看类信息
 *   
 */
public class TestReflect {

	public static void main(String[] args) {
		Class<Student> c = Student.class;
        Constructor[] cs = c.getConstructors();
        for(int i=0;i<cs.length;i++){
        	Object o = cs[i];
        	System.out.println(o);
        }
        
        Field[] fs = c.getDeclaredFields();
        for(Field f:fs){
        	System.out.println(f.getName()+": "+f.getGenericType());
        }
        
        Method[] ms = c.getMethods();
        for(Method m:ms){
        	System.out.println(m.getName()+" "+m.getReturnType()+"  "+m.getDefaultValue());
        }
        
        
       try {
		Student s =  Student.class.newInstance();//Class.forName();
		//Student s = Class.forName("com.qf.lesson.Student").newInstance();
		s.setSid(10);
		s.setSname("hello");
		System.out.println(s.toString());
	} catch (InstantiationException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	} 
	}

}
