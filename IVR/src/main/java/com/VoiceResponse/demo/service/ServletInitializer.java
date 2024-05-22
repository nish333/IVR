package com.VoiceResponse.demo.service;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.VoiceResponse.demo.IvrApplication;

public class ServletInitializer extends SpringBootServletInitializer 
{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) 
	{
		return application.sources(IvrApplication.class);
	}
}
