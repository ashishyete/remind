/**
 * 
 */
package app.remind.controllers;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import app.remind.util.RemindProperties;

/**
 * @author ac03582
 *
 */

@Controller
public class WelcomeController {
	final static Logger logger = Logger.getLogger(WelcomeController.class);
	
	@Autowired
	RemindProperties props;
	
	@GetMapping(path = "/welcomeBanner")
	@ResponseBody
	public String welcome() {
		return "Welcome!";
	}
	
	@GetMapping(path="/")
	public String welcomeBanner() {
		logger.info("Welcome Page called!");
		return "welcome";
	}
	
	
	 @PostConstruct
	    public void init() {
	 
	        logger.info(props.toString());
	    }

}
