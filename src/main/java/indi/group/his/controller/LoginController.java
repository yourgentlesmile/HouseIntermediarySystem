package indi.group.his.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import indi.group.his.model.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	public static String safecode="";
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public String home(Locale locale) {
		logger.debug("Index,jsp has been requested");
		return "Index";
	}
	@RequestMapping(value = "/getsafecode", method = RequestMethod.GET)
	public @ResponseBody String getSafeCode() {
		logger.debug("getSafeCode hes been invoked");
		return safecode;
	}
	@RequestMapping(value = "/LoginCheck", method = RequestMethod.POST)
	public @ResponseBody User loginCheck(@RequestBody User user) {
		logger.debug("username:{0},password:{1}",user.getUsername(),user.getPassword());
		return user;
	}
	
}
