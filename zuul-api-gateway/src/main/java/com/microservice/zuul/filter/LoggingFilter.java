package com.microservice.zuul.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class LoggingFilter extends ZuulFilter {

	@Override
	public Object run() {
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		HttpServletResponse response = RequestContext.getCurrentContext().getResponse();
		System.out.println("Request Object: " + request.getRequestURI());
		if (response != null) {
			System.out.println("Response Object: " + response.toString());
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

}
