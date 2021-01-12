/**
 * 
 */
package com.mySRPNT2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Juan
 *
 */
@Controller
public class HomeController {

	/**
	 * 
	 */
	
	@RequestMapping(value = "/")
	public String index() {
		return "index"; 
	}
	
	public HomeController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
