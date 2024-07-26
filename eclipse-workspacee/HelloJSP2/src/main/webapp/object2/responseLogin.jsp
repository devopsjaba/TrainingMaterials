<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	String id = request.getParameter("user_id");
	String pwd = request.getParameter("user_pw");
	if (id.equalsIgnoreCase("kosta") && pwd.equalsIgnoreCase("1234")) 
		response.sendRedirect("responseWelcome.jsp");
	else 
		request.getRequestDispatcher("responseMain.jsp?loginErr=1").forward(request, response);

%>