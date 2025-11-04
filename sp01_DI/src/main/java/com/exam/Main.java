package com.exam;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		 AbstractApplicationContext ctx =  new ClassPathXmlApplicationContext("classpath:applicationContext2.xml");
		 
		Restaurant restaurant = 
					ctx.getBean(Restaurant.class);
		restaurant.order();
		
		EmpServiceTest empService =
				ctx.getBean(EmpServiceTest.class);
		empService.register();
	}
}