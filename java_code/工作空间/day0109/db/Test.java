package com.qf.lesson.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.qf.lesson.Person;

public class Test {

	public static void main(String[] args) {
		String sql = "select * from user";
        ResultSet rs = DBUtils.getResult(sql);
        List<Person>  list = new ArrayList<Person>();
        try {
			while(rs.next()){
				Person p = new Person();
				//根据列名或列索引获取对应列的值,建议使用列名
				int id = rs.getInt("sid");
				p.setSid(id);
				String name = rs.getString("name");
				p.setName(name);
				String sex = rs.getString("sex");
				p.setSex(sex);
				int age = rs.getInt("age");
				p.setAge(age);
				list.add(p);
			}
			System.out.println(list);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
        finally{
        	if(rs!=null){
        		try {
					rs.close();
				} catch (SQLException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
        	}
        }
        
	}

}
