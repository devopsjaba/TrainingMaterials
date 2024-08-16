package com.kosta.kostait;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestMappingTest {

	@RequestMapping({"/login/hello.do", "/login/hi.do"})		// http://localhost:9000/kostait/login/hi.do
	public void test1() {
		System.out.println("urlpattern=/login/hello.do");
	}
	
	@RequestMapping("/login/*")		//  /login/hello      /login/hi  
	public void test2() {  
		System.out.println("urlpattern=/login/*");
	}	
	
	@RequestMapping("/login/**/tmp/*.do")					// /login/tmp/hello.do     /login/abc/tmp/hello.do
	public void test3() {  
		System.out.println("urlpattern=/login/**/tmp/*.do");
	}
	
	@RequestMapping("/login/??")								// /login/hi, /login/my.car
	public void test4() {  
		System.out.println("urlpattern=/login/??");
	}
		
	@RequestMapping("*.do")									// /hello.do,      /hi.do,       /login/hi.do 
	public void test5() {  
		System.out.println("urlpattern=*.do");		
	}
	
	@RequestMapping("/*.???")									//  /hello.aaa,   /abc.txt
	public void test6() {  
		System.out.println("urlpattern=*.do");		
	}
	
}
