package com.yedam.exam;

import org.springframework.stereotype.Component;

@Component
public class Restaurant {
	
	Chef chef;
	
	public Restaurant(Chef chef) {
		super();
		this.chef = chef;
	}

	public void order() {
		chef.cook();
	}
}