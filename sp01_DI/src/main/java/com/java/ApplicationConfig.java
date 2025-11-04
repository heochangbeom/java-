package com.java;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.container.AppleSpeaker;
import com.container.Speaker;
import com.factory.SamsungTV;
import com.factory.TV;

@Component
public class ApplicationConfig {
	
	@Bean
	public Speaker speaker() {
		return new AppleSpeaker();
	}
	
	@Bean
	public TV tv() {
		//생성자
		//return new SamsungTV();
		
		//setter
		SamsungTV tv = new SamsungTV();
		tv.setSpeaker(speaker());
		return tv;
	}
}
