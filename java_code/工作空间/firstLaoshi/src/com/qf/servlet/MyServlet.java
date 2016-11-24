package com.qf.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
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
//		request.setCharacterEncoding("utf-8");//璁剧疆璇锋眰鐨勭紪鐮�
//		response.setContentType("text/html;charset=utf-8");//璁剧疆鍝嶅簲鐨勭紪鐮�
		String name = request.getParameter("user");
		String pass = request.getParameter("pass");
		String sex =request.getParameter("sex");
		String[] favors =  request.getParameterValues("favor");
		
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>娉ㄥ唽淇℃伅</title></head><body>");
		out.print("<table><tr><th>濮撳悕</th><th>瀵嗙爜</th><th>鎬у埆</th><th>鐖卞ソ</th></tr>");
		out.print("<tr><td>");
		out.print(name);
		out.print("</td><td>");
		out.print(pass);
		out.print("</td><td>");
		out.print(sex);
		out.print("</td><td>");
		for(String s:favors){
			out.print(s+" ");
		}
		out.print("</td></tr>");
		out.print("</table>");
		out.print("</body></html>");
	}

}
