package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.factory.TV;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
				
		TV tv = context.getBean(TV.class);
		tv.powerOn();
		tv.volumeUp();
	}
}
