package com.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthRepository {
	
	@Autowired
	public void insert() {
		System.out.println("권한등록");
	}
}
