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

@WebServlet("/fileUploads")
@MultipartConfig(maxFileSize=1024*1000*3, maxRequestSize=1024*1000*3*5)
public class MultiFileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MultiFileUploadServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		FileUtil.fileWrite(request, "profile", "/uploadFolder");
		
		
		/*
		//brown, sally
		String[] userIds = request.getParameterValues("userId");
		
		Collection<Part> parts = request.getParts();
		for (Part part : parts) {
			if (part.getName().equals("profile")) {
				String contentString = part.getHeader("Content-Disposition");
				String fileName = FileUtil.getFileName(contentString);
				
				String uploadPath = getServletContext().getRealPath("/uploadFolder");
//				String filePath = uploadPath + File.separator + fileName;
				String filePath = uploadPath + File.separator + UUID.randomUUID().toString();
				part.write(filePath);
				part.delete();
			}
		}
		*/
	}
	
}
