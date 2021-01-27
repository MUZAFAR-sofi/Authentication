package com.authenticationservice.domain;

import java.io.Serializable;

public class JwtRequestSim implements Serializable {

	private static final long serialVersionUID = 5926468583005150707L;
	
	private long isdn;
	
	//need default constructor for JSON Parsing
	public JwtRequestSim()
	{
		
	}

	public long getIsdn() {
		return isdn;
	}

	public void setIsdn(long isdn) {
		this.isdn = isdn;
	}

	
}