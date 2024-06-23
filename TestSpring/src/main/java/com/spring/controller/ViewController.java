package com.spring.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.dto.TempDTO;
import com.spring.service.ViewService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ViewController {

	
	private final ViewService viewService;
	
	@Autowired SqlSession session;
	
	@GetMapping("/test")
	public String test(Model model) {
		model.addAttribute("dto", viewService.test(TempDTO.builder().no(1).build()));
		return "test";
	}
	
	@GetMapping("/list")
	public String list() {
			
		return "list";
	}
	
	@GetMapping("/detail")
	public String detail(Model model, HttpServletRequest req) {
		
		
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		
//		TempDTO dto2 = new TempDTO();  //NoArgsConstructor
		TempDTO dto = TempDTO.builder()  //AllArgsConstructor
				.title(title)
				.content(content)
				.accept(true)
				.build();
		
	
		
//		session.update("");
//		session.delete("");
//		dto = session.selectOne("sql.findOne", dto);
		
		session.insert("sql.save", dto);
		
		model.addAttribute("title", title);
		model.addAttribute("content", content);
		
		
		return "detail";
	}
	
	@GetMapping("/new")
	public String newp(Model model, HttpServletRequest request) {	
		
		
		
		
		
		return "new";
	}

}
