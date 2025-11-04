package com.container;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.factory.TV;

public class Main {
	public static void main(String[] args) {
		 AbstractApplicationContext ctx =  new GenericXmlApplicationContext("annotation/annoContext.xml");
		
		TV tv = (TV)ctx.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
	}
}
