package util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

/**
 * FileUtil.java
 *
 * @author "K.S.J"
 * @since 2018. 5. 10.
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 * 수정일 수정자 수정내용
 * ---------- ------ ------------------------
 * 2018. 5. 10. "K.S.J" 최초 생성
 *
 * </pre>
 */
public class FileUtil {
	/**
	 * Method : getFileName
	 * 최초작성일 : 2018. 5. 10.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param contentDisposition
	 * @return
	 * Method 설명 : Content-Disposition 헤더에서 파일명을 추출
	 */
	public static String getFileName(String contentDisposition) {
		//form-data; name="profile"; filename=".gitignore"
		String[] headers = contentDisposition.split(";");
		//form-data;
		// name="profile";
		// filename=".gitignore"
		
		String fileName = null;
		for (String header : headers) {
			if (header.startsWith(" filename=")) {
				fileName = header.substring(header.indexOf("\"")+1, header.length()-1);
				break;
			}
		}
		
		return fileName;
	}
	
	public static List<String> fileWrite(HttpServletRequest request, String partName, String outputPath) throws IOException, IllegalStateException, ServletException{
		
		Collection<Part> parts = request.getParts();
		List<String> fileNames = new ArrayList<String>();
		
		for (Part part : parts) {
			if (part.getName().equals(partName)) {
				String contentDisposition = part.getHeader("Content-Disposition");
				
				String[] headers = contentDisposition.split(";");
				
				String fileName = null;
				for (String header : headers) {
					if (header.startsWith(" filename=")) {
						fileName = header.substring(header.indexOf("\"")+1, header.length()-1);
						fileNames.add(fileName);
						break;
					}
				}
				
				String uploadPath = request.getServletContext().getRealPath(outputPath);
				String filePath = uploadPath + File.separator + fileName;
//				String filePath = uploadPath + File.separator + UUID.randomUUID().toString();
				part.write(filePath);
				part.delete();
			}
		}

		return fileNames;
	}
	
}
