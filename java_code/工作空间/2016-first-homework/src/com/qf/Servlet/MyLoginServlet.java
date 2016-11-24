package com.qf.Servlet;
/*
 *    登陆程序:用户名和密码输入框，提交按钮。当用户名和密码为空时，

显示用户名或密码为空。当用户名登陆失败的时候，显示用户名或密码错误

。当用户登陆成功的时候，显示欢迎XXX登陆。
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/MyLoginServlet")
public class MyLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyLoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("GBK");
		response.setContentType("text/html;charset=GBK");
		String name = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		PrintWriter out = response.getWriter();
		if(name.equals("admin")&&pass.equals("1234")){
			out.print("欢迎登陆！！");
		}
		else if(name.equals("")||pass.equals("")){
			out.print("用户名或密码为空。。");
		}
		else{
			out.print("登录失败。。。");
		}
	}

}
