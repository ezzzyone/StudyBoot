package com.iu.home.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.iu.home.interceptor.StudyInterceptor;
import com.iu.home.interceptor.TestInterceptor;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class InterceptorConfig implements WebMvcConfigurer {
	
	@Autowired
	//IOC (Inversion of Controll - 제어의 역전. 스프링에게 대신 해달라고 위임)
	private TestInterceptor testInterceptor;
	
	@Autowired
	private StudyInterceptor studyInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//. 추가로 붙여 추가 설정하기 = method chain
		//적용할 interceptor 등록
		registry.addInterceptor(testInterceptor)
		//interceptor url
		.addPathPatterns("/qna/**")
		//제외할 url
		.excludePathPatterns("/qna/detail");
		
		registry.addInterceptor(testInterceptor)
		.addPathPatterns("/qna/**");
		
		//WebMvcConfigurer.super.addInterceptors(registry);
	}

}
