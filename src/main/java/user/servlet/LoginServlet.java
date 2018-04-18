package user.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import user.model.UserVO;
import user.service.UserService;
import user.service.UserServiceInf;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
//		PrintWriter pw = response.getWriter();
//		
//		String[] userIds = request.getParameterValues("userId");//userId 라는 이름으로 여러개 들어올 경우 배열로 바꾸어 저장함
//		for (String userId : userIds) {
//			pw.write("userId : " + userId + "<br>");
//		}
//		pw.write("password : " + request.getParameter("password") + "<br>");
		
		UserServiceInf service = new UserService();
		String userId = request.getParameter("userId");
		UserVO userVO = new UserVO("", request.getParameter("userId"), request.getParameter("password"));
		boolean loginResult = service.loginProcess(userVO);
		if (loginResult) {
			// as-is : redirect / to-be : dispatch forward
//			response.sendRedirect("main.jsp");
			request.setAttribute("userId", userId);
			
			HttpSession session = request.getSession();
			session.setAttribute("userId", userId);
			
			ServletContext sc = getServletContext();
			sc.setAttribute("userId", "APPLICATION");
			
			RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
			rd.forward(request, response);
		} else {
			response.sendRedirect("login/login.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
