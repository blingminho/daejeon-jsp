package student.dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import student.model.StudentVO;
/**
 * StudentDao.java
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
public class StudentDao implements StudentDaoInf {

	private static StudentDao dao = new StudentDao();
	private SqlMapClient smc;
	
	private StudentDao() {
		try {
			Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			smc = SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Method : getInstance
	 * 최초작성일 : 2018. 4. 18.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @return
	 * Method 설명 : StudentDao 객체 반환
	 */
	public static StudentDaoInf getInstance(){
		return dao;
	}


	@Override
	public List<StudentVO> getStudentAll() {
		List<StudentVO> resultList = null;
		try {
			resultList = smc.queryForList("student.getStudentAll");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultList;
	}

}
