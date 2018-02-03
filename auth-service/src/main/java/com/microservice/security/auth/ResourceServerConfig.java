/**
 *
 */
package com.microservice.security.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author Chetan
 *
 */
@EnableResourceServer
@Configuration
public class ResourceServerConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.parentAuthenticationManager(authenticationManager).inMemoryAuthentication().withUser("Chetan")
				.password("Patel").roles("USER").and().withUser("Dhara").password("Patel").roles("ADMIN");
	}

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.requestMatchers().antMatchers("/login", "/oauth/authorize").and().httpBasic().and()
				.authorizeRequests().anyRequest().authenticated();
		
		/*httpSecurity

        .authorizeRequests()

        .antMatchers("/").permitAll()

        .antMatchers("/private/**").authenticated();
*/		
		httpSecurity.csrf().disable();
	}
}
