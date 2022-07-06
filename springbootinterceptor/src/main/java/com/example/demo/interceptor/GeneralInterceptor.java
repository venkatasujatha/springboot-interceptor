package com.example.demo.interceptor;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
@Component
public class GeneralInterceptor implements HandlerInterceptor{
	private org.slf4j.Logger logger=LoggerFactory.getLogger(GeneralInterceptor.class);
			
	@Override
	public boolean preHandle(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse,Object handler)throws Exception
	{
		logger.info("prehandle invoked"+httpServletRequest.getRequestURI(),httpServletRequest.getMethod());
		return true;
		
	}
	@Override
	public void postHandle(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse,Object handler,ModelAndView modelAndView)throws Exception
	{
		logger.info("posthandle invoked"+httpServletRequest.getRequestURI(),httpServletRequest.getMethod());
	}
	@Override
	public void afterCompletion(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse,Object handler,Exception exception)throws Exception
	{
		if(exception!=null)
		{
			logger.error("exception inside aftercompletion"+exception.getMessage());
		}
		logger.info("after cpmpletion invoked"+httpServletRequest.getRequestURI(),httpServletRequest.getMethod());
	}
	

}
