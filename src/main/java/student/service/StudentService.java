package student.service;

import java.util.List;

import student.dao.StudentDao;
import student.dao.StudentDaoInf;
import student.model.StudentVO;
/**
 * StudentService.java
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
public class StudentService implements StudentServiceInf {
	
	private static StudentService service = new StudentService();
	private StudentDaoInf dao;
	
	private StudentService() {
		dao = StudentDao.getInstance();
	}
	
	
	@Override
	public List<StudentVO> getStudentAll() {
		List<StudentVO> resultList = dao.getStudentAll();
		return resultList;
	}

	/**
	 * Method : getInstance
	 * 최초작성일 : 2018. 4. 18.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @return
	 * Method 설명 : StudentService 객체 반환
	 */
	public static StudentServiceInf getInstance() {
		return service;
	}

}
