package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatchServlet
 */
@WebServlet("/DispatchServlet")
public class DispatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String clas = request.getParameter("class");
		System.out.println("class : " + clas);
		
		//request객체에 class 파라미터를 설정
		request.setAttribute("requestInfo", clas);
		
		//dispatch
		RequestDispatcher rd = request.getRequestDispatcher("reqres/dispatchTarget.jsp");
		rd.forward(request, response);
	}

}
