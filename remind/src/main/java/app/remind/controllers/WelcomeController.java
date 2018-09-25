/**
 * 
 */
package app.remind.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ac03582
 *
 */

@Controller
public class WelcomeController {
	final static Logger logger = Logger.getLogger(WelcomeController.class);

	@GetMapping(path = "/welcomeBanner")
	@ResponseBody
	public String welcome() {
		return "Welcome!";
	}
	
	@GetMapping(path="/")
	public String welcomeBanner() {
		logger.info("Welcome Page called!");
		return "login";
	}

}
