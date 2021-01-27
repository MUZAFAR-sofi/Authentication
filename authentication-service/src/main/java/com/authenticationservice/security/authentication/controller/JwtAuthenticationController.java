package com.authenticationservice.security.authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.authenticationservice.domain.JwtRequestSim;
import com.authenticationservice.domain.JwtResponse;
import com.authenticationservice.security.util.JwtTokenUtil;

@RestController
@CrossOrigin
public class JwtAuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;


	private void authenticate(String isdn) throws Exception {

		

	}

	@RequestMapping(value = "/getToken", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationTokenForIsdn(@RequestBody JwtRequestSim authenticationRequest)
			throws Exception {

		// code for authenticate goes here authenticate() use restemplate to verify and
		// then generate token else return resonse
		if (authenticationRequest.getIsdn() != 12345) {
			return new ResponseEntity<>("Invalid simcard number",HttpStatus.UNAUTHORIZED);
		}
		authenticate(String.valueOf(authenticationRequest.getIsdn()));

		final String token = jwtTokenUtil.generateToken(String.valueOf(authenticationRequest.getIsdn()));

		return ResponseEntity.ok(new JwtResponse(token));
	}

}