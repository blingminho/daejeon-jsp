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
	
	/**
	 * Method : getUserTest
	 * 최초작성일 : 2018. 5. 8.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param mem_id
	 * @return
	 * Method 설명 : 회원 상세정보 조회 테스트
	 */
	@Test
	public void getUserTest(){
		/***Given***/
		UserDaoInf userDao = new UserDao();
//		String mem_id = "a001";
//		String mem_name = "김은대";
//		String mem_pass = "asdfasdf";
		String mem_id = "ㅋ";
		String mem_name = "ㅋ";
		String mem_pass = "z";
		
		/***When***/
		UserVO userVO = userDao.getUser(mem_id);
		
		/***Then***/
		assertNotNull(userVO);
		assertEquals(mem_id, userVO.getMem_id());
		assertEquals(mem_name, userVO.getMem_name());
		assertEquals(mem_pass, userVO.getMem_pass());
	}
	
	/**
	 * Method : insertUserTest
	 * 최초작성일 : 2018. 5. 9.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * Method 설명 : 신규 회원 입력 테스트
	 */
	@Test
	public void insertUserTest(){
		/***Given***/
		UserDaoInf userDao = new UserDao();
		UserVO userVO = new UserVO("sally", "샐리", "병아리", "1234", "대전 중구 중앙로 76", "영민빌딩 2층", "34940", "");
		
		/***When***/
		int insertCnt = userDao.insertUser(userVO);

		/***Then***/
		assertEquals(1, insertCnt);
	}
	
	/**
	 * Method : deleteUserTest
	 * 최초작성일 : 2018. 5. 10.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param userVO
	 * @return
	 * Method 설명 : 기존 사용자 삭제 테스트
	 */
	@Test
	public void deleteUserTest(){
		/***Given***/
		UserDaoInf userDao = new UserDao();
		UserVO userVO = new UserVO("sally", "샐리", "병아리", "1234", "대전 중구 중앙로 76", "영민빌딩 2층", "34940", "");
		
		/***When***/
		int deleteCnt = userDao.deleteUser(userVO);
		
		/***Then***/
		assertEquals(1, deleteCnt);
		
	}

	/**
	 * Method : modifyUserTest
	 * 최초작성일 : 2018. 5. 11.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * Method 설명 : 기존 사용자 정보 수정 테스트
	 */
	@Test
	public void modifyUserTest(){
		/***Given***/
		UserDaoInf userDao = new UserDao();
		UserVO userVO = new UserVO("sally", "샐리", "병아리", "1234", "대전 중구 중앙로 76", "영민빌딩 2층", "34940", "dd");

		/***When***/
		int updateCnt = userDao.modifyUser(userVO);
		
		/***Then***/
		assertEquals(1, updateCnt);
		UserVO updateUser = userDao.getUser(userVO.getMem_id());
		assertEquals(userVO.getMem_alias(), updateUser.getMem_alias());
		
	}
	
}
