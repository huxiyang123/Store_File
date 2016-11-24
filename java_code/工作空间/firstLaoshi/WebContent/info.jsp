<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <% 
    request.setCharacterEncoding("utf-8");//设置请求的编码
	response.setContentType("text/html;charset=utf-8");//设置响应的编码
    String name = request.getParameter("user");
    String pass = request.getParameter("pass");
    String[] favors = request.getParameterValues("favor");
    StringBuilder sb = new StringBuilder();
    for(String s:favors){
    	sb.append(s);
    }
    String result = sb.toString();
  %>
  <table>
    <tr>
      <th>名字</th> <th>密码</th><th>爱好</th>
    </tr>
    <tr>
      <td><%=name%></td><td><%=pass %></td><td><%=result %></td>
    </tr>
  </table>
  
</body>
</html>