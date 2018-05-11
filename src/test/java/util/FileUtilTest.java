package util;

import static org.junit.Assert.*;

import org.junit.Test;

import util.FileUtil;

/**
 * FileUploadServletTest.java
 *
 * @author "K.S.J"
 * @since 2018. 5. 9.
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 * 수정일 수정자 수정내용
 * ---------- ------ ------------------------
 * 2018. 5. 9. "K.S.J" 최초 생성
 *
 * </pre>
 */
public class FileUtilTest {
	
	//Content-Disposition 헤더에서 파일명을 추출
	@Test
	public void getFileNameTest() {
		/***Given***/
		String contentDisposition = "form-data; name=\"profile\"; filename=\".gitignore\"";
		
		/***When***/
		String fileName = FileUtil.getFileName(contentDisposition);
		
		/***Then***/
		assertEquals(".gitignore", fileName);
		
	}

}
