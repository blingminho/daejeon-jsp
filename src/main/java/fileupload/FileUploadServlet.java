package fileupload;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import util.FileUtil;

@WebServlet("/fileUpload")
@MultipartConfig(maxFileSize=1024*1000*3, maxRequestSize=1024*1000*3*5)
public class FileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FileUploadServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String profile = request.getParameter("profile");
		
		Part userIdPart = request.getPart("userId");
		Part profilePart = request.getPart("profile");
		
		String contentString = profilePart.getHeader("Content-Disposition");
		String fileName = FileUtil.getFileName(contentString);
		
		//사용자가 파일 업로드 -> 서버상에 해당 파일 저장
		//1.서버상의 특정위치에 파일을 저장
		//url 경로에 해당하는 절대 위치를 반환
		//getRealPath('/uploadFolder') ==> 
//		getServletContext().getRealPath(path);
		String uploadPath = getServletContext().getRealPath("/uploadFolder");
		String filePath = uploadPath + File.separator + fileName;
		profilePart.write(filePath);
		profilePart.delete();
		
		
		
	}

}
