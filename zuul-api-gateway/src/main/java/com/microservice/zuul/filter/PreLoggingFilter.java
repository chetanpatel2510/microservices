package com.microservice.zuul.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * This is PRE logging filter which is called before actual processing of
 * request by internal service.
 * 
 * @author Chetan
 *
 */
@Component
public class PreLoggingFilter extends ZuulFilter {

	/**
	 * 0 is the first order.
	 */
	@Override
	public int filterOrder() {
		return 0;
	}

	/**
	 * pre means before calling internal service. post means after calling
	 * internal service.
	 */
	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public Object run() {
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		HttpServletResponse response = RequestContext.getCurrentContext().getResponse();
		System.out.println("PRE Request Object: " + request.getRequestURI());
		if (response != null) {
			System.out.println("PRE Response Object: " + response.toString());
		}
		return null;
	}

	/**
	 * Return true to use this filter
	 */
	@Override
	public boolean shouldFilter() {
		return true;
	}

}
