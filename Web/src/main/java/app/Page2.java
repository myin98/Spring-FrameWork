package app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page2")
public class Page2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher dis = req.getRequestDispatcher("/WEB-INF/page2.jsp");
		
		String dan = req.getParameter("dan");
		System.out.println(dan);
		
		int s = 1;
		int d = 0;
		
		if(dan == null || "A".equals(dan)) {
			s = 1;
			d = 10;
		}else if("1".equals(dan)) {
			s = 1;
			d = 2;
		}else if("2".equals(dan)) {
			s = 2;
			d = 3;
		}else if("3".equals(dan)) {
			s = 3;
			d = 4;
		}else if("4".equals(dan)) {
			s = 4;
			d = 5;
		}else if("5".equals(dan)) {
			s = 5;
			d = 6;
		}else if("6".equals(dan)) {
			s = 6;
			d = 7;
		}else if("7".equals(dan)) {
			s = 7;
			d = 8;
		}else if("8".equals(dan)) {
			s = 8;
			d = 9;
		}else if("9".equals(dan)) {
			s = 9;
			d = 10;
		}
		
		List list = new ArrayList<>(); 
		for(int i = s; i < d; i++ )
		{
			List list2 = new ArrayList<>();
			for(int j = 1; j < 10; j++) {
				String str = i + " * " + j + " = " + (i * j);
//				System.out.println();
				list2.add(str);
			}
			list.add(list2);
		}
		req.setAttribute("dan", s);
		req.setAttribute("list", list);

		dis.forward(req, resp);
		
		
		
		
	}
	

	

}
