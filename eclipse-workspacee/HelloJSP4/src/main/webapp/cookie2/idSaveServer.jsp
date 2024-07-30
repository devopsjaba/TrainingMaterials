<%@page import="kr.co.kosta.util.JSFunction"%>
<%@page import="kr.co.kosta.util.CookieManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	String user_id = request.getParameter("user_id");
	String user_pw = request.getParameter("user_pw");
	String save_check = request.getParameter("save_check");
	
	System.out.println(user_id +" : "+ user_pw);
	// 로그인 성공
	if ("kosta".equals(user_id) && "1234".equals(user_pw)) {
		
		if(save_check != null && save_check.equals("Y")) {
			//쿠기 생성하기
			CookieManager.makeCookie(response, "loginId", user_id, 86400);			
		} else {
			//쿠키 삭제
			CookieManager.deleteCookie(response, "loginId");
		}
	// 로그인 실패		
	} else {
		JSFunction.alertBack("로그인에 실패하였습니다.", out);
	}
	
%>