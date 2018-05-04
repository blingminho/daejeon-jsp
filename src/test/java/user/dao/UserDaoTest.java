package user.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import user.model.UserVO;
/**
 * UserDaoTest.java
 *
 * @author "K.S.J"
 * @since 2018. 5. 4.
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 * 수정일 수정자 수정내용
 * ---------- ------ ------------------------
 * 2018. 5. 4. "K.S.J" 최초 생성
 *
 * </pre>
 */
public class UserDaoTest {
	
	/**
	 * Method : getUserPageList
	 * 최초작성일 : 2018. 5. 3.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param page
	 * @param pageSize
	 * @return
	 * Method 설명 : 회원 페이지 list 조회 테스트
	 */
	@Test
	public void getUserPageListTest() {
		//UserDao 객체의 getUserPageList 메서드 테스트
		/***Given***/
		UserDaoInf userDao = new UserDao();
		int page = 1;
		int pageSize = 10;
		
		/***When***/
		List<UserVO> userList = userDao.getUserPageList(page, pageSize);
		
		/***Then***/
		assertNotNull(userList);
		assertEquals(10, userList.size());
	}

	@Test
	public void getUserTotalCntTest(){
		/***Given***/
		UserDaoInf userDao = new UserDao();
		
		/***When***/
		int userTotalCnt = userDao.getUserTotalCnt();
		
		/***Then***/
		assertEquals(31, userTotalCnt);
	}
	
	
	
}
