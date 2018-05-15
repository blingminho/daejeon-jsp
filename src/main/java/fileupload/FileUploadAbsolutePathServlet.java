package fileupload;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
//fileuploadAbsoluteForm.jsp
@WebServlet("/fileUploadAbsolutepath")
@MultipartConfig(maxFileSize=1024*1000*3, maxRequestSize=1024*1000*3*5)
public class FileUploadAbsolutePathServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
//    private final String UPLOAD_PATH = "D:\\A_TeachingMaterial\\7.JspSpring\\uploadStorage";
    private final String UPLOAD_PATH = "D:/A_TeachingMaterial/7.JspSpring/uploadStorage";
	
    public FileUploadAbsolutePathServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		
		String userId = request.getParameter("userId");
		pw.write("userId : " + userId + "<br>");
		
		Part profilePart = request.getPart("profile");
		
		String filePath = "";
		if (profilePart.getSize() > 0) {
			filePath = UPLOAD_PATH + File.separator + UUID.randomUUID().toString() + ".jpg";
			profilePart.write(filePath);
			profilePart.delete();
		}
		
		//filePath webmember.mem_profile에 저장
		//기존 : url형태로 저장 /uploadFolder/Jellyfish.jpg
		//변경 : 물리적 디스크의 절대경로로 저장 D:\\A_TeachingMaterial\\7.JspSpring\\uploadStorage
		pw.write("filePath : " + filePath + "<br>");
		
	}

}
