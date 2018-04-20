package student.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import student.model.StudentVO;
import student.service.StudentService;
import student.service.StudentServiceInf;
/**
 * StudentServiceJunit.java
 *
 * @author "K.S.J"
 * @since 2018. 4. 18.
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 * 수정일 수정자 수정내용
 * ---------- ------ ------------------------
 * 2018. 4. 18. "K.S.J" 최초 생성
 *
 * </pre>
 */
public class StudentServiceJunit {
	/**
	 * Method : getStudentAllTest
	 * 최초작성일 : 2018. 4. 18.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * Method 설명 : 학생 전체 조회
	 */
	@Test
	public void getStudentAllTest() {
		/***Given***/
		StudentServiceInf service = StudentService.getInstance();

		/***When***/
		List<StudentVO> resultList = service.getStudentAll();

		/***Then***/
		assertNotNull(resultList);
		assertEquals(5, resultList.size());
		
		assertEquals("2016120001", resultList.get(0).getStud_no());
		assertEquals("엄소현", resultList.get(0).getStud_name());
		assertEquals("206", resultList.get(0).getStud_alias());
	}

}
