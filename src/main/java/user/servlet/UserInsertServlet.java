package user.servlet;

import java.io.IOException;
import java.util.List;

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
@WebServlet("/userInsert")
@MultipartConfig(maxFileSize=1024*1000*3, maxRequestSize=1024*1000*3*5)
public class UserInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private UserServiceInf userService;

	public UserInsertServlet() {
		super();
		userService = new UserService();
	}

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
		List<String> fileNames = FileUtil.fileWrite(request, "mem_profile", "/uploadFolder");
		
		for (String fileName : fileNames) {
			String mem_profile = "/uploadFolder/" + fileName;
			UserVO userVO = new UserVO(mem_id, mem_name, mem_alias, mem_pass,
					mem_add1, mem_add2, mem_zip);
			userVO.setMem_profile(mem_profile);
			//db에 신규 회원 입력
			int insertCnt = userService.insertUser(userVO);
			
			// 정상적으로 신규 회원이 입력된 경우 : 회원 리스트 페이지로 이동
			if (insertCnt == 1) {
				//유저목록창으로 이동
				response.sendRedirect(request.getContextPath() + "/getUserPageList");

			}
			// 정상적으로 회원 입력을 하지 못한경우 : 신규 회원 입력 페이지
			else {
				
			}
		}
		
		/*
		Part part = request.getPart("mem_profile");
		String contentDisposition = part.getHeader("Content-Disposition");
		String fileName = FileUtil.getFileName(contentDisposition);
		String path = getServletContext().getRealPath("/uploadFolder");
		String realPath = path + java.io.File.separator + fileName;
		String mem_profile = "/uploadFolder/" + fileName;
		
		
		UserVO userVO = new UserVO(mem_id, mem_name, mem_alias, mem_pass,
				mem_add1, mem_add2, mem_zip);
		userVO.setMem_profile(mem_profile);
		
		//db에 신규 회원 입력
		int insertCnt = userService.insertUser(userVO);
		
		// 정상적으로 신규 회원이 입력된 경우 : 회원 리스트 페이지로 이동
		if (insertCnt == 1) {
			//파일 추가
			part.write(realPath);
			part.delete();
			
			//유저목록창으로 이동
			response.sendRedirect(request.getContextPath() + "/getUserPageList");

		}
		// 정상적으로 회원 입력을 하지 못한경우 : 신규 회원 입력 페이지
		else {
			
		}
		*/
	}
	
}
