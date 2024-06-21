package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.dto.TempDTO;


@Controller
public class ListController {
	
	@Autowired
	private SqlSession session;
	
//	@GetMapping("/list")
//	public String list() {
//			
//		return "list";
//	}
//	
//	@GetMapping("/detail")
//	public String detail(Model model, HttpServletRequest req) {
//		
//		String title = req.getParameter("title");
//		String content = req.getParameter("content");
//
//		
//		
//		model.addAttribute("title", title);
//		model.addAttribute("content", content);
//		
//		return "detail";
//	}
//	
//	@GetMapping("/new")
//	public String newp(Model model, HttpServletRequest request) {	
//		
//		
//		return "new";
//	}
	
	
}
