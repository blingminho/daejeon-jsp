package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sumCalculation")
public class SumCalculation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do GET");
		
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do POST");
		
		int start = Integer.valueOf(request.getParameter("start"));
		int end = Integer.valueOf(request.getParameter("end"));
		
		int sumResult = 0;
		for (int i = start; i <= end; i++) {
			sumResult += i;
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("sumResult", sumResult);
		
		// forword 방식
		RequestDispatcher dispatcher = request.getRequestDispatcher("sumResult.jsp");
		dispatcher.forward(request, response);
		
		// redirect 방식
//		response.sendRedirect(request.getContextPath() + "/sumResult.jsp");
		
	}

}
