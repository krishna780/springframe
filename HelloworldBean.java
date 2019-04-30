package com.in28minutes.rest.webservices.restfulwebservices;

public class HelloworldBean {

	private String message;

	public HelloworldBean(String message) {
		// TODO Auto-generated constructor stub
		this.message=message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloworldBean [message=" + message + ", getMessage()=" + getMessage() + "]";
	}

	
}
