package com.microservice.security.auth;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/principal")
    public Principal user(Principal principal) {
        return principal;
    }
	
	@GetMapping(value = "/")
	public String index() {
		return "Hello world";
	}

	@GetMapping(value = "/private")
	public String privateArea() {
		return "Private area";
	}

}