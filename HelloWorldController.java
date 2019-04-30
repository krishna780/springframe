package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//controller
@RestController 
public class HelloWorldController {
	
	// mapping method 
	@GetMapping(path = "/hello-world")
	public String Helloworld() {
	return "hello world" ;
	

}
	@GetMapping(path = "/hello-world-bean")
	public HelloworldBean HelloworldBean() {
	return new HelloworldBean("hello world") ;
	}
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloworldBean HelloworldPathVariable(@PathVariable String name) {
	return new HelloworldBean(String.format("helloworld , %S ",  name)) ;
	}
}