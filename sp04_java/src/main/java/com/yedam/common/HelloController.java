package com.yedam.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yedam.board.mapper.BoardMapper;

@Controller
public class HelloController {
@Autowired BoardMapper boardMapper;
	
	@GetMapping("/")
	public String selectall(){
		return "hello";
	}	
}
