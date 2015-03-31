package com.research.test.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.research.test.entity.User;

public class UserValidator implements Validator{

	public boolean supports(Class object) {
		// TODO Auto-generated method stub
		return User.class.equals(object);
	}

	public void validate(Object ob, Errors errors) {
		System.out.println("in validator");
		 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "user.required");
	     ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password.required");
	      
		
	}
	
	

}
