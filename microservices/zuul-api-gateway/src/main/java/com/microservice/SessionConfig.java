package com.microservice;

import javax.servlet.ServletContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.ExpiringSession;
import org.springframework.session.SessionRepository;
import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;
import org.springframework.session.web.http.CookieHttpSessionStrategy;
import org.springframework.session.web.http.HeaderHttpSessionStrategy;
import org.springframework.session.web.http.HttpSessionStrategy;
import org.springframework.session.web.http.SessionRepositoryFilter;

@Configuration
public class SessionConfig extends AbstractHttpSessionApplicationInitializer {
	@Bean
	public <S extends ExpiringSession> SessionRepositoryFilter<? extends ExpiringSession> springSessionRepositoryFilter(SessionRepository<S> sessionRepository, ServletContext servletContext) {
	    SessionRepositoryFilter<S> sessionRepositoryFilter = new SessionRepositoryFilter<S>(sessionRepository);
	    sessionRepositoryFilter.setServletContext(servletContext);
	    CookieHttpSessionStrategy httpSessionStrategy = new CookieHttpSessionStrategy();
	    httpSessionStrategy.setCookieName("x-auth-token");
	    sessionRepositoryFilter.setHttpSessionStrategy(httpSessionStrategy);
	    return sessionRepositoryFilter;
	}
	@Bean
    public HttpSessionStrategy httpSessionStrategy() {
        return new HeaderHttpSessionStrategy();
    }
	
}
