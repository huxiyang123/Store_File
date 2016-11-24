package com.qf.lesson.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
/*
 *数据库操作工具类
 */
public class DBUtils {
	//获取数据库的Connection连接
	private static Connection getConnection() {
		Properties p = new Properties();
		// 数据库地址
		// String url = "jdbc:sqlite://g:/test.db";
		// 获取连接
		Connection conn = null;
		try {
			//p.load(DBUtils.class.getResourceAsStream("db.properties"));
			p.load(new FileInputStream("db/db.properties"));
			String driverName = p.getProperty("jdbc.driverClassName");
			String url = p.getProperty("jdbc.url");
			String name = p.getProperty("jdbc.username");
			String pass = p.getProperty("jdbc.password");
			// 加载驱动
			Class.forName(driverName);
			conn = DriverManager.getConnection(url, name, pass);
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return conn;
	}
	//获取查询结果集：select 
	public static ResultSet getResult(String sql){
		//获取连接
		Connection conn = getConnection();
		//获取可执行SQL语句Statement对象
		ResultSet rs =null;
		try {
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return rs;
	}
	
	public static boolean executeSql(String sql){
		//获取连接
		Connection conn = getConnection();;
		//执行成功的行数：insert update delete都执行该方法
		int num=0;
		try {
			// 获取Statement对象
			Statement stmt = conn.createStatement();
			num = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return num>0;	
	}
	
}
