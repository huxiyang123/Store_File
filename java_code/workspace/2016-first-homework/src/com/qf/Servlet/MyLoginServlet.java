package com.qf.Servlet;
/*
 *    ��½����:�û���������������ύ��ť�����û���������Ϊ��ʱ��

��ʾ�û���������Ϊ�ա����û�����½ʧ�ܵ�ʱ����ʾ�û������������

�����û���½�ɹ���ʱ����ʾ��ӭXXX��½��
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
			out.print("��ӭ��½����");
		}
		else if(name.equals("")||pass.equals("")){
			out.print("�û���������Ϊ�ա���");
		}
		else{
			out.print("��¼ʧ�ܡ�����");
		}
	}

}