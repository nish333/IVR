package com.VoiceResponse.demo.service;

public interface TwilioService 
{
	
	public void sendSms(String to, String from, String body);
	
	public void makeCall(String from, String to);

}
