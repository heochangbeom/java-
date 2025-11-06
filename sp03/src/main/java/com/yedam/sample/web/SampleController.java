package com.yedam.sample.web;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
@RequestMapping("/sample/*")
public class SampleController {
	
	@GetMapping("/sucess")
	public String sucess() {
		return "/sucess";
	}

	@RequestMapping(value = {"insert", "/"}, 
			method = {RequestMethod.POST, 
					  RequestMethod.GET})
	public void basic() {
		log.info("basic.....");
	}
	
	@GetMapping("/ex01")	//ex01?name=aaa&age=15
	public String ex01(@ModelAttribute SampleDTO sample,
			RedirectAttributes ra ) {
		log.info("sampleDTO: " + sample);
		ra.addFlashAttribute("msg", "가입축하!!");
		ra.addAttribute("name", sample.getName());
//		return "redirect:/sucess";	// 절대경로://http://
									//redirect 뒤에는 매핑 url
									// forward 뒤에는 페이지명
									// 상대경로: http://
		return "redirect:/sample/sucess";
	}

	@GetMapping("/ex02") // ex02?name=aaa&age=20
	public String ex02(@ModelAttribute("name")
					   @RequestParam("name") String name,
					   
					   @DateTimeFormat(pattern = "yyyy-MM-dd") Date birth, 
					   @RequestParam(value = "age", required = false, defaultValue = "10") int age) {
		log.info(name + ":" + age);
		return "sucess";
	}

	@GetMapping("/ex02Array") //es02Array?ids=3&ids=4&ids=10
	public void ex02Array(@RequestParam("ids") List<String> ids) {
		log.info("ids: " + ids);
	}
	
	@GetMapping("/ex03")
	public ModelAndView ex03() {
		ModelAndView mv = new ModelAndView("/hello", "greet", "hi");
//		mv.setViewName("/hello");
//		mv.addObject("greet", "hi");
		return mv;
	}

}
