package student.dao;

import java.util.List;

import student.model.StudentVO;
/**
 * StudentDaoInf.java
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
public interface StudentDaoInf {
	/**
	 * Method : getStudentAll
	 * 최초작성일 : 2018. 4. 18.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @return
	 * Method 설명 : 모든 학생의 정보를 List로 반환
	 */
	List<StudentVO> getStudentAll();

}
