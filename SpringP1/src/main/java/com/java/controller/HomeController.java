package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller   //화면 처리용 (어노테이션) DI 형식
public class HomeController {

	@GetMapping("/")  //doGet();
	public String home(Model model) {
		model.addAttribute("txt", "전송 데이터");
		return "home";
		
	}
	
	@GetMapping("/form")
	public String form() {
		return "Form";
	}
	
	@GetMapping("/result")
	public String result() {
		return "Result";
	}
	
	
}
