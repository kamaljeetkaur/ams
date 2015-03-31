package com.research.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.research.test.businessservice.UserBusinessService;
import com.research.test.entity.User;

public class UserController extends MultiActionController {
	
	private Validator userValidator;
	private BindingResult errors;
	
	public BindingResult getErrors() {
		return errors;
	}

	public void setErrors(BindingResult errors) {
		this.errors = errors;
	}


	public Validator getUserValidator() {
		return userValidator;
	}

	public void setUserValidator(Validator userValidator) {
		this.userValidator = userValidator;
	}

	private UserBusinessService userBusinessService;

	public UserBusinessService getUserBusinessService() {
		return userBusinessService;
	}

	public void setUserBusinessService(UserBusinessService userBusinessService) {
		this.userBusinessService = userBusinessService;
	}
	
	public ModelAndView getLoginPage(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("in Login page");
		ModelAndView view = new ModelAndView("login");
		view.addObject("msg", "Welcome To login Page");
		return view;
	}
	
	public ModelAndView doLogin(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("in doLogin()");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		User user = new User();
		user.setUsername(userName);
		user.setPassword(password);
		
		userValidator.validate(user, errors);
		
		boolean userExist = userBusinessService.userExist(user);
		if(userExist){
			ModelAndView view = new ModelAndView("successfullLogin");
			view.addObject("user",userName);
			return view;
		} else {
			ModelAndView view = new ModelAndView("login");
			view.addObject("Error", "login Failed. Please enter username/password again");
			return view;
		}
		
	}

	public ModelAndView saveUser(HttpServletRequest request,HttpServletResponse response) {
		User user = createUser();
		getUserBusinessService().saveUser(user);
		ModelAndView view = new ModelAndView("user");
		view.addObject("user", "user");
		view.addObject("msg", "hello world");
		return view;
	}
	
	public List<User> fetchUsers() {
		return null;
	}
	
	User createUser() {
		User user = new User();
		user.setFirstName("Arvind");
		user.setLastName("Gupta");
		user.setCity("del");
		return user;
	}
	
	@Override
	protected void bind(HttpServletRequest request, Object command) throws Exception {
		ServletRequestDataBinder binder = null;
			binder = createBinder(request, command);
			binder.bind(request);
			errors = binder.getBindingResult();
	}


}
