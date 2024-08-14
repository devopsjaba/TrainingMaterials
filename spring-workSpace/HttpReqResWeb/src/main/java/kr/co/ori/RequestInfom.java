package kr.co.ori;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestInfom {

	@RequestMapping("/requestinfom")
	public void kosta(HttpServletRequest request) {
		System.out.println("request.getCharacterEncoding() : "+request.getCharacterEncoding());
		System.out.println("request.getMethod() : "+request.getMethod());
		System.out.println("request.getProtocol() : "+request.getProtocol());
		System.out.println("request.getScheme() : "+request.getScheme());
		System.out.println("request.getServerName() : "+request.getServerName());
		System.out.println("request.getServerPort() : "+request.getServerPort());
		System.out.println("request.getRequestURL() : "+request.getRequestURL());
		System.out.println("request.getRequestURI() : "+request.getRequestURI());
		System.out.println("request.getContextPath() : "+request.getContextPath());
		System.out.println("request.getServletPath() : "+request.getServletPath());
		System.out.println("request.getQueryString() : "+request.getQueryString());
	}
}






