package com.research.test.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.research.test.entity.User;

public class UserValidator implements Validator{

	public boolean supports(Class object) {
		return User.class.equals(object);
	}

	public void validate(Object ob, Errors errors) {
		System.out.println("in validator");
		 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "required.userName","arv");
	     ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password.required");
	}
	
	

}
