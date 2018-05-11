package user.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import user.model.UserVO;
import user.service.UserService;
import user.service.UserServiceInf;
import util.FileUtil;

@MultipartConfig(maxFileSize=1024*1000*3, maxRequestSize=1024*1000*3*2)
@WebServlet("/modifyUser")
public class UserModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserServiceInf userService = new UserService();
	
    public UserModifyServlet() {
        super();
    }

    //사용자 수정 폼 요청
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mem_id = request.getParameter("mem_id");
		
		//서비스 객체를 통해서 getUser
		UserVO userVO = userService.getUser(mem_id);
		
		//request객체에 user정보를 setAttribute
		request.setAttribute("userVO", userVO);
		
		//foward (/user/userModify.jsp)
		RequestDispatcher rd = request.getRequestDispatcher("/user/userModify.jsp");
		rd.forward(request, response);
		
	}

	//사용자 정보 수정
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mem_id = request.getParameter("mem_id");
		String mem_name = request.getParameter("mem_name");
		String mem_alias = request.getParameter("mem_alias");
		String mem_pass = request.getParameter("mem_pass");
		String mem_add1 = request.getParameter("mem_add1");
		String mem_add2 = request.getParameter("mem_add2");
		String mem_zip = request.getParameter("mem_zip");
		
		//part에서 mem_profile 정보(파일이름)
		//정해진 위치 (/uploadFolder)에 파일지정
		//userVO에 mem_profile 정보 추가(setter, 생성자를 수정)
		String mem_profilePath = "";
		Part mem_profilePart = request.getPart("mem_profile");
		if (mem_profilePart.getSize() > 0) {
			String contentDisposition = mem_profilePart.getHeader("Content-Disposition");
			String fileName = FileUtil.getFileName(contentDisposition);
			String path = getServletContext().getRealPath("/uploadFolder");
			String realPath = path + java.io.File.separator + fileName;
			mem_profilePath = "/uploadFolder/" + fileName;
			
			mem_profilePart.write(realPath);
			mem_profilePart.delete();
		}
		
		//사용자가 profile 정보를 수정하지 않은 경우 : 기존값 유지
		//uploadFolder/ryan.png
		if(mem_profilePath.equals("")){
			UserVO originUser = userService.getUser(mem_id);
			mem_profilePath = originUser.getMem_profile();
		}
		
		//사용자 정보 수정
		UserVO userVO = new UserVO(mem_id, mem_name, mem_alias, mem_pass, mem_add1, mem_add2, mem_zip, mem_profilePath);
		System.out.println(userVO.toString());
		int updateCnt = userService.modifyUser(userVO);
		
		// 정상 수정 (정보수정은 redirect) : 사용자 상세 조회 화면으로 이동
		if (updateCnt == 1) {
			//유저목록창으로 이동
			response.sendRedirect(request.getContextPath() + "/getUser?mem_id=" + mem_id);
		}
		// 정상적으로 회원 입력을 하지 못한경우 : 신규 회원 입력 페이지
		else {
			
		}
		
		
	}

}
