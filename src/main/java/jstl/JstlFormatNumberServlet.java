package jstl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jstlFormatNumberServlet")
public class JstlFormatNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	//localhost:8070/jsp/jstlFormatServlet
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//test 값 설정
		request.setAttribute("price", 10000);
		request.setAttribute("stringNumber", "123,456");
		
		
		//화면을 담당할 jsp로 위임(jstl/fmtNumber.jsp)
		request.getRequestDispatcher("jstl/fmtNumber.jsp").forward(request, response);
		
	}

}
