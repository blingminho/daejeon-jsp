package user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.model.UserVO;
import user.service.UserService;
import user.service.UserServiceInf;

@WebServlet("/userInsert")
public class UserInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private UserServiceInf userService;

	public UserInsertServlet() {
		super();
		userService = new UserService();
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String mem_id = request.getParameter("mem_id");
		String mem_name = request.getParameter("mem_name");
		String mem_alias = request.getParameter("mem_alias");
		String mem_pass = request.getParameter("mem_pass");
		String mem_add1 = request.getParameter("mem_add1");
		String mem_add2 = request.getParameter("mem_add2");
		String mem_zip = request.getParameter("mem_zip");

		UserVO userVO = new UserVO(mem_id, mem_name, mem_alias, mem_pass,
				mem_add1, mem_add2, mem_zip);
		int insertCnt = userService.insertUser(userVO);
		
		// 정상적으로 신규 회원이 입력된 경우 : 회원 리스트 페이지로 이동
		if (insertCnt == 1) {
			response.sendRedirect(request.getContextPath() + "/getUserPageList");

		}
		// 정상적으로 회원 입력을 하지 못한경우 : 신규 회원 입력 페이지
		else {
			
		}

	}

}
