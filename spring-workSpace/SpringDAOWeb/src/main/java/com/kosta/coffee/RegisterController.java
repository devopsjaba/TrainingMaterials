package com.kosta.coffee;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/register")
public class RegisterController {
	@Autowired
	UserDao userDao;
	final int FAIL = 0;
	
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
		binder.setValidator(new UserValidator());    // UserValidator를 WebDataBinder의 validator로 등록.  사용자가 정의 검증 로직 추가 
		
		List<Validator> validatorList = binder.getValidators();
		System.out.println("validatorList  = " + validatorList);			// 검증기 리스트 출력
	}
	
	//@RequestMapping(value = "/register/save", method = {RequestMethod.POST})
	@PostMapping("/add")
	public String save(@Valid User user, BindingResult result, Model m) {
		System.out.println("result = " + result); 				//바인딩 및 검증 결과 출력
		System.out.println("user = " + user); 					//사용자 입력 정보 출력 
		
		//DB에 회원 정보 저장
		if(!result.hasErrors()) {				// User 객체 검증한 결과 에러가 없으면
			int rowCnt = userDao.insertUser(user);
			if (rowCnt != FAIL) return "registerinfo";				// /WEB-INF/views/registerinfo.jsp
		}
		
		return "registerForm";			  //  오류가 있을 경우 폼 페이지로 다시 돌아감 	
	}

}








