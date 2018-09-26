package app.remind.controllers;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import app.remind.util.RemindProperties;

@Controller
public class LoginController {
	
	@Autowired
	RemindProperties props;
	
	final static Logger logger = Logger.getLogger(LoginController.class);

	@GetMapping(path = "/login")
	public ModelAndView launchLoginScreen(HttpSession session, ModelAndView model) {
		logger.info("- launchLoginScreen called ");
		session.setAttribute("appUrl", props.getAppUrl());
		model.setViewName("login");
		return model;
	}
	

}
