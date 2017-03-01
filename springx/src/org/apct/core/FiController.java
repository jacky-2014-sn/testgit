package org.apct.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FiController {
	
	@RequestMapping(value="hi", method=RequestMethod.GET)
	@ResponseBody
	public void createHi() {
		System.out.println("hi");
	}
}
