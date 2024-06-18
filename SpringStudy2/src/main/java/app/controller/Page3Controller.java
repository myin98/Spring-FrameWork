package app.controller;



import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class Page3Controller {
	

	@Autowired
	private SqlSession session;
	
	@GetMapping("/page3")
	public String page3() {
			
		
		return "page3";
	}
	
	@GetMapping("/page4")
	public String page4(Model model, HttpServletRequest request) {
		
		int cnt = Integer.parseInt(request.getParameter("cnt"));
		String txt = request.getParameter("txt");
		System.out.println(cnt + " : " + txt);
		
		model.addAttribute("cnt", cnt);
		model.addAttribute("txt", txt);

		return "page4";
	}
	

	
}
