package com.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmpRepository {
	
	@Autowired
	public void insert() {
		System.out.println("사원등록");
	}
}
