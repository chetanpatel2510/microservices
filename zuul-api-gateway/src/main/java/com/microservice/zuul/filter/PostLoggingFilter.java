/**
 *
 */
package com.microservice.zuul.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * This is post logging filter which is executed after actual processing of
 * request by internal service.
 * 
 * @author Chetan
 *
 */
@Component
public class PostLoggingFilter extends ZuulFilter {

	/*
	 * (non-Javadoc)
	 *
	 * @see com.netflix.zuul.ZuulFilter#filterOrder()
	 */
	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.netflix.zuul.ZuulFilter#filterType()
	 */
	@Override
	public String filterType() {
		return "post";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.netflix.zuul.IZuulFilter#run()
	 */
	@Override
	public Object run() {
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		HttpServletResponse response = RequestContext.getCurrentContext().getResponse();
		System.out.println("POST Request Object: " + request.getRequestURI());
		if (response != null) {
			System.out.println("POST Response Object: " + response.toString());
		}
		return null;
	}

	/**
	 * Should apply this filter
	 */
	@Override
	public boolean shouldFilter() {
		return true;
	}

}
