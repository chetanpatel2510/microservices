package com.microservice;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.microservice.security.entities.CustomUserDetails;
import com.microservice.security.entities.Role;
import com.microservice.security.entities.User;
import com.microservice.security.repository.UserRepository;
import com.microservice.security.service.UserService;

@SpringBootApplication
@EnableEurekaClient
public class AuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthServiceApplication.class, args);
	}
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	public void authenticationManager(AuthenticationManagerBuilder builder, UserRepository repository, UserService service) throws Exception {

		//Setup a default user if db is empty

		if (repository.count()==0)

			service.save(new User("user", "user", Arrays.asList(new Role("USER"), new Role("ACTUATOR"))));

		builder.userDetailsService(userDetailsService(repository)).passwordEncoder(passwordEncoder);

	}



	/**

	 * We return an istance of our CustomUserDetails.

	 * @param repository

	 * @return

     */

	private UserDetailsService userDetailsService(final UserRepository repository) {

		return username -> new CustomUserDetails(repository.findByUsername(username));

	}
	
	
	  /*@Bean public CorsFilter corsFilter() { final
	  UrlBasedCorsConfigurationSource source = new
	 UrlBasedCorsConfigurationSource(); final CorsConfiguration config = new
	  CorsConfiguration(); config.setAllowCredentials(true);
	  config.addAllowedOrigin("*"); config.addAllowedHeader("*");
	  config.addAllowedMethod("OPTIONS"); config.addAllowedMethod("HEAD");
	  config.addAllowedMethod("GET"); config.addAllowedMethod("PUT");
	  config.addAllowedMethod("POST"); config.addAllowedMethod("DELETE");
	  config.addAllowedMethod("PATCH"); source.registerCorsConfiguration("/**",
	  config); return new CorsFilter(source); }*/
	 
}
