package com.example.demo.emp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpController {
//아작스 응답 처리
	@GetMapping("/empMain")
	public String page() {
		return "emp";
	}
}
