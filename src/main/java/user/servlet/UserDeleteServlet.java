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

@WebServlet("/deleteUser")
public class UserDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserDeleteServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		UserServiceInf userService = new UserService();
		
		String mem_id = request.getParameter("mem_id");
		UserVO userVO = new UserVO();
		userVO.setMem_id(mem_id);
		
		int deleteCnt = userService.deleteUser(userVO);
		
		if (deleteCnt == 1){
			response.sendRedirect(request.getContextPath() + "/getUserPageList");
		}
	}

}
 