package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fmtServlet")
public class FmtServlet extends HttpServlet {
	private static  final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("FmtServlet doGet 호출");
		String language = request.getParameter("language");
		if(language == null)
			language = "ko";
		
		request.setAttribute("language", language);
		
		RequestDispatcher rd = request.getRequestDispatcher("/jstl/fmtBundle4.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
