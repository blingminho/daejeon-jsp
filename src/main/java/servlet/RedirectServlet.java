package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirectServlet
 */
@WebServlet("/RedirectServlet")
public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String clas = request.getParameter("class");
		System.out.println("class : " + clas);
		
		//request객체에 class 파라미터를 설정
		request.setAttribute("requestInfo", clas);
		
		//send redirect
		response.sendRedirect("reqres/redirectTarget.jsp");
		
	}

}
