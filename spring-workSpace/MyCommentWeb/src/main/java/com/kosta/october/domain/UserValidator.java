package com.kosta.october.domain;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

// 검증이란 관심사로 분리
public class UserValidator implements Validator {		//객체를 검증하기 위한 인터페이스. 객체 검증기(Validator) 구현에 사용

	@Override
	public boolean supports(Class<?> clazz) {
		// Validator가 검증할 수 있는 클래스 타입을 확인
		return User.class.isAssignableFrom(clazz);		// clazz가 User 또는 그 자손인지 확인 
	}

	@Override
	public void validate(Object target, Errors errors) {  // target : 검증할 객체, errors : 검증시 발생한 에러저장소 
		// 실제 객체의 상태를 검증함. 검증 로직 작성
		// 문제가 있을 경우, 'errors' 객체에 에러를 등록할수 있음
		System.out.println("UserValidator.validate() 호출됨");
		
		User user = (User)target;
		String id = user.getId();
		
		//비었거나 공백이면 id라는 iv에 required라는 에러코드를 저장 
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pwd", "required");
		
		if(id == null || id.length() <5 || id.length() > 12) {		// 5~12사이가 아니면
			errors.rejectValue("id", "invalidLength", new String[] {"5", "12"}, null);
		}
		
	}

}






