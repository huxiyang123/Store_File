package com.qf.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * Servlet:��һ��λ��Servlet����˵�Java�࣬
 * 
 *   ʹ��HttpServlet���裺
 *     1 �����̳�HttpServlet������
 *     2 ������Ҫ�����Ǹ����doGet()��doPost()����
 *     3 ע��Servlet��
 *       1) ��web.xml������
 *       2) ʹ��ע�ͷ�ʽ
 *       doGet()��doPost()
 *       getParameter("")
 *       3)
 */
public class loginServlet extends HttpServlet {

	private static final long serialVersionUID = -6799469170944345111L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO �Զ����ɵķ������
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String name = req.getParameter("user");//��������ȡ�����Ӧ��ֵ
		String pass = req.getParameter("pass");//��������ȡ�����Ӧ������
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