package com.qf.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * Servlet:是一个位于Servlet服务端的Java类，
 * 
 *   使用HttpServlet步骤：
 *     1 创建继承HttpServlet的子类
 *     2 根据需要，覆盖父类的doGet()和doPost()方法
 *     3 注册Servlet：
 *       1) 在web.xml中配置
 *       2) 使用注释方式
 *       doGet()和doPost()
 *       getParameter("")
 *       3)
 */
public class loginServlet extends HttpServlet {

	private static final long serialVersionUID = -6799469170944345111L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO 自动生成的方法存根
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String name = req.getParameter("user");//服务器获取组件对应的值
		String pass = req.getParameter("pass");//服务器获取组件对应的密码
		PrintWriter out = resp.getWriter();
		if(name.equals("admin")&&pass.equals("12345")){
			out.print("welcome!!!");
		}
		else{
			out.write("failed");
		}
		//String pass = req.getPart("");
	}
}
