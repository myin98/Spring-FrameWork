package app.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import app.dto.DatDTO;



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
		//페이지 호출하면서 추가 파라미터를 받아온다
		int cnt = Integer.parseInt(request.getParameter("cnt"));
		String txt = request.getParameter("txt");
		System.out.println(cnt + " : " + txt);
		
		//받아온 데이터 dto에 넣기
		DatDTO dto = new DatDTO();
		dto.setNum(cnt);
		dto.setMsg(txt);
		//insert 쿼리문 실행   파라미터로 dto클래스 넣기
		session.insert("sql.insertDat", dto);
		
		//select 쿼리문 실행시 dto클래스에 있는 데이터 를 이용해서 받은 데이터를 리스트 형식에 담기
		List<DatDTO> list = session.selectList("sql.selectDat", dto);
		
		//모델에 조회해온 데이터를 담는다.
		model.addAttribute("cnt", list.get(0).getNum());
		model.addAttribute("txt", list.get(0).getMsg());
		
		//페이지4를 리턴
		return "page4";
	}
	
	
	
	

	
}
