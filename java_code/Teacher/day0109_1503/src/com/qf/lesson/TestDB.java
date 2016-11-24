package com.qf.lesson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * JDBC:Java DataBase Connectivity:java数据库连接。是一个规范。
 *     通过JDBC,java应用程序可以管理数据库。是一种用于执行SQL语句的Java API，JDBC可以为多种关系数据库提供统一访问，
 *     它由一组用Java语言编写的类和接口组成。
 *   相关类或接口：位于java.sql包
 *      DriverManager：管理jdbc驱动程序。
 *      Connection:用于建立一个数据库连接对象
 *      Statement:执行对应的SQL语句
 *      PerpardStatement：执行预处理sql语句对象
 *      ResultSet：查询的结果集
 *    使用步骤：前提是驱动jar包添加到项目构建路径中
 *      1 加载数据库驱动
 *      2 获取数据库连接
 *      3 传入SQL语句进行数据库操作
 *      4 获取返回值
 *      5 关闭连接     
 */
public class TestDB {

	public static void main(String[] args) {
		Connection conn = null;		
		try {
			// 加载驱动
			Class.forName("org.sqlite.JDBC");
			// 数据库地址
			String url = "jdbc:sqlite://g:/test.db";			
			// 获取连接
			conn = DriverManager.getConnection(url);
			// 获取Statement对象
			Statement stmt = conn.createStatement();
			//执行成功的行数：insert update delete都执行该方法
			int num = stmt.executeUpdate("insert into user(name,sex,age) values('wangwu99','女',20)");
			if (num>0) {
				System.out.println("insert success!!");
			} else {
				System.out.println("failure!!");
			}
			
			List<Person>  list = new ArrayList<Person>();
			//执行查询：select
			ResultSet rs = stmt.executeQuery("select * from user");
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
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}

	}

}
