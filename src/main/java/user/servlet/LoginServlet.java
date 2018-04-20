package user.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
		String remember = request.getParameter("remember");
		System.out.println("remember : " + remember);
		boolean loginResult = service.loginProcess(userVO);
		if (loginResult) {
			//쿠키 설정 파라미터가 넘어온 경우 쿠키값을 설정한다
			setCookie(remember, userId, response);
			
			
			
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
	 * Method : setCookie
	 * 최초작성일 : 2018. 4. 20.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param remember
	 * @param userId
	 * Method 설명 : 쿠키 값을 설정
	 */
	private void setCookie(String remember, String userId, HttpServletResponse response) {
		//쿠키를 설정하는 경우(remember값이 check인 경우)
		if (remember != null && remember.equals("true")) {
			Cookie cookie = new Cookie("userId", userId);
			cookie.setMaxAge(30*24*60*60);//30일 설정
			
			Cookie rememberCookie = new Cookie("remember", "true");
			rememberCookie.setMaxAge(30*24*60*60);//30일 설정
			
			response.addCookie(cookie);
			response.addCookie(rememberCookie);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
