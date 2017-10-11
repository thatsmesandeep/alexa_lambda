package com.askis;

import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

public class HelloRequestHandler extends SpeechletRequestStreamHandler {

	private static final Set<String> supportedApplicationIds = new HashSet<String>();
	 
    static {
        String appId = System.getenv("APP_ID");
        supportedApplicationIds.add(appId);
    }
    
    public HelloRequestHandler(){
    	super(new HelloSpeechlet(),supportedApplicationIds);
    }	

}
