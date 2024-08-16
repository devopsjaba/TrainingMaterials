package com.kosta.kostait;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class RegisterController {
	
	//@RequestMapping(value = "/register/add", method = {RequestMethod.GET})
	//@RequestMapping(value = "/register/add")
	//@GetMapping("/register/add")
	public String register() {
		return "registerForm";			// /WEB-INF/views/registerForm.jsp
	}
	
	//@RequestMapping(value = "/register/save", method = {RequestMethod.POST})
	@PostMapping("/register/save")
	public String save() {
		return "registerinfo";				// /WEB-INF/views/registerinfo.jsp
	}

}
