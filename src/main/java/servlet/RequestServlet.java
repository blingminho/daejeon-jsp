package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestServlet
 */
@WebServlet("/RequestServlet")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.write("request.getMethod() : " + request.getMethod() + "\n");
		pw.write("request.getRemoteAddr() : " + request.getRemoteAddr() + "\n");
		pw.write("request.getLocalAddr() : " + request.getLocalAddr() + "\n");
		pw.write("request.getRequestURI() : " + request.getRequestURI() + "\n");
		pw.write("request.getRequestURL() : " + request.getRequestURL() + "\n");
		
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		pw.write("userId : " + userId + "\n");
		pw.write("password : " + password + "\n");
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
