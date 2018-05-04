package user.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.service.UserService;
import user.service.UserServiceInf;

@WebServlet("/getUserPageList")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserServiceInf userService;
	
	public UserServlet(){
		super();
		userService = new UserService();
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//getUserPageList?page=1&pageSize=10;
		
		//page 파라미터가 없을 경우 --> 1page
		//pageSize 파라미터가 없을 경우 --> 10
		String pageString = request.getParameter("page");
		int page = pageString == null ? 1 : Integer.valueOf(pageString);
		
		String pageSizeString = request.getParameter("pageSize");
		int pageSize = pageSizeString == null ? 10 : Integer.valueOf(pageSizeString);
		
		Map<String, Object> resultMap = userService.getUserPageList(page, pageSize);
		
		request.setAttribute("userList", resultMap.get("userList"));
		request.setAttribute("pageNav", resultMap.get("pageNav"));
		
		RequestDispatcher rd = request.getRequestDispatcher("/user/userList.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
