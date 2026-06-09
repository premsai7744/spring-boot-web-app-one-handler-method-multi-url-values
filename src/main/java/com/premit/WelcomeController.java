package com.premit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	
	@ResponseBody
	@RequestMapping(path= {"/welcome","/app"},method=RequestMethod.GET)
	public String printMessage() {
		return "Welcome to PremIT.";
	}
}	
