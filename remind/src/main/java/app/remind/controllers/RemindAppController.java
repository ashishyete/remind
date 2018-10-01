/**
 * 
 */
package app.remind.controllers;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import app.remind.model.RemindForm;
import app.remind.util.RemindProperties;

/**
 * @author Ashish
 *
 */

@Controller
public class RemindAppController {

	@Autowired
	RemindProperties props;
	
	final static Logger logger = Logger.getLogger(RemindAppController.class);
	
	

	@GetMapping(path = "/login")
	public ModelAndView launchLoginScreen(HttpSession session, ModelAndView model) {		
		logger.info("- launchLoginScreen called ");
		session.setAttribute("appUrl", props.getAppUrl());
		model.setViewName("login");
		return model;
	}

	@PostMapping(path = "/signup")
	public ModelAndView registration(HttpSession session, ModelAndView model) {
		logger.info("- regisrtration screen called ");
		session.setAttribute("appUrl", props.getAppUrl());
		model.setViewName("signup");
		return model;
	}

	@PostMapping(path = "/forgotpass")
	public ModelAndView forgotPass(HttpSession session, ModelAndView model) {
		logger.info("- forgotPass screen called ");
		session.setAttribute("appUrl", props.getAppUrl());
		model.setViewName("forgotpassword");
		return model;
	}

}
