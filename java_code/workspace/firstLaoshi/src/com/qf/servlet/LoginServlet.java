package com.qf.servlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * Servlet:是一个位于servlet服务端的java类,能处理客户端的请求信息
 *   HttpServelet:是Servelt的一个子类，使用Http协议处理客户端请求信息，位于web服务端。
 *   使用HttpServelt步骤：
 *     1 创建继承HttpServelet的子类
 *     2 根据需要，覆盖父类的doGet()和doPost()方法。
 *     3 注册Servlet:
 *       1)在web.xml中配置
 *          <servlet>      
              <servlet-name>servlet名字</servlet-name>
              <servlet-class>Servlet类的全路径</servlet-class>      
            </servlet>
 
            <servlet-mapping>       
             <servlet-name>servlet名字</servlet-name>
             <url-pattern>映射地址（form表单的action属性中配置）</url-pattern>
            </servlet-mapping>
 *       2)使用注解方式
 *         
 *   HttpServletRequest:使用Http协议的一次客户端请求
                     调用doGet()或者doPost()之前，该对象已经由web服务器创建完毕。
            方法：
       getParameter("页面组件的名字");获取表单中对应名字组件的值
       getParameterValues("页面组件的名字");获取页面中名字相同的所有组件的值。通常在复选框中使用
       req.getPart("页面file组件的名字");获取页面中type为file的组件对应的对象。
     HttpServletResoponse:使用Http协议传输的服务器响应
                     调用doGet()或者doPost()之前，该对象已经由web服务器创建完毕。
              方法：
       getWriter();获取PrintWriter对象：可以以Output方式向浏览器写出返回信息。
  Servlet的生命周期：
     1 init():初始化操作，例如请求  响应对象的初始化
     2 service():请求的转发操作。根据method类型转发给对应的doMethod（）方法处理
     3 destroy():servlet不被使用后调用的方法
  页面跳转：
    1 服务端跨页面跳转：页面之间传递request中封装数据，浏览器地址栏不变
      req.getRequestDispatcher(跳转页面).forward(req,resp);
    2 客户端跳转：页面之间不能使用request传递数据，浏览器地址栏会变化
      resp.sendRedirect(跳转页面);
 */
public class LoginServlet extends HttpServlet {

	/**
	 * @Field serialVersionUID
	 */
	private static final long serialVersionUID = -7066826522917920954L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	doPost(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	
    	String name = req.getParameter("user");//获取组件对应的用户名
    	String pass = req.getParameter("pass");//获取密码
//    	Part filePart = req.getPart("myfile");
//    	OutputStream os = new FileOutputStream(filePart.getName());
//    	InputStream is = filePart.getInputStream();
//    	int len =0;
//    	byte[] bs = new byte[1024];
//    	while((len=is.read(bs))!=-1){
//    		os.write(bs, 0, len);
//    	}
    	PrintWriter out = resp.getWriter();
    	if(name.equals("admin")&&pass.equals("123456")){
//    		out.print("<html><head><title>response page</title></head>");
//    		out.print("<body><p style='color:green;'>welcome you!!");
//    		out.print(name);
//    		out.print("</p><p style='font-size:30px;'>thank you for your visit very much!!!!</p></body>");    		
//    		out.print("</html>");
    		req.setAttribute("uname", name);
    		req.getRequestDispatcher("success.jsp").forward(req,resp);
    	}
    	else{
    		req.setAttribute("info", "login failed!!");
    		resp.sendRedirect("fail.jsp");
    	}
    }
	
}
