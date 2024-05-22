package com.VoiceResponse.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.VoiceResponse.demo.service.TwilioService;

@RestController
public class TwilioController 
{

	@Autowired
	TwilioService twillioService;
	
	@Value("${app.twillio.fromPhoneNo}")
	private String from;
	
	@Value("${app.twillio.toPhoneNo}")
	private String to;

	@GetMapping("/sendsms")
	public String sendSms() 
	{
		String body = "Hello. Good Morning!!";
		twillioService.sendSms(to, from, body);
		return "Message sent successfully...";	
	}
	
	
	@GetMapping("/makecall")
	public String makeVoiceCall() 
	{
		twillioService.makeCall(from, to);
		return "Call initiated...";	
	}
	
}
