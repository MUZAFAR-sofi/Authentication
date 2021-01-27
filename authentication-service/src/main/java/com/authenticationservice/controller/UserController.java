package com.authenticationservice.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author sofiahmed
 *
 */
@RestController
@RequestMapping("/rest/")
@CrossOrigin
public class UserController {


	@GetMapping(path = "/")
	public String welcome() {

		return "Welcome Your Authentication is Successfull";
	}

}
