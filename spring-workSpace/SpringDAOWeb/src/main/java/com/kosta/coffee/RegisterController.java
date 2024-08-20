package com.kosta.coffee;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/register")
public class RegisterController {
	
	//@RequestMapping(value = "/register/add", method = {RequestMethod.GET})
	//@RequestMapping(value = "/register/add")
	@GetMapping("/add")
	public String register() {
		return "registerForm";			// /WEB-INF/views/registerForm.jsp
	}
	
	@InitBinder		//  WebDataBinder에 Validator 등록함 (WebDataBinder에 데이터 검증기를 등록함)
	public void registerValidate(WebDataBinder binder) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(df, false));		//날짜 형식을 엄격하게 처리 
		binder.setValidator(new UserValidator());    // UserValidator를 WebDataBinder의 validator로 등록 
		
		List<Validator> validatorList = binder.getValidators();
		System.out.println("validatorList  = " + validatorList);	
	}
	
	//@RequestMapping(value = "/register/save", method = {RequestMethod.POST})
	@PostMapping("/add")
	public String save() {
		return "registerinfo";				// /WEB-INF/views/registerinfo.jsp
	}

}








