package com.example.demo.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.interceptor.GeneralInterceptor;
@Configuration
public class InterceptorConfig implements WebMvcConfigurer
{
	
	@Autowired
	private GeneralInterceptor generalInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry interceptorRegistry)
	{
		interceptorRegistry.addInterceptor(generalInterceptor).addPathPatterns("/invoked/get").excludePathPatterns("/invoked/get/2");
	}
	
	 
	 
}
