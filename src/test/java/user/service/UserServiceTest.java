package user.service;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import user.dao.UserDao;
import user.dao.UserDaoInf;
import user.model.UserVO;
/**
 * UserServiceTest.java
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
public class UserServiceTest {

	@Test
	public void getUserPageListTest() {
		/***Given***/
		UserServiceInf userService = new UserService();
		int page = 1;
		int pageSize = 10;
		
		/***When***/
		Map<String, Object> resultMap = userService.getUserPageList(page, pageSize);
		
		/***Then***/
		//1.회원 페이지 list에 대한 검증
		List<UserVO> userList = (List<UserVO>) resultMap.get("userList");
		
		assertNotNull(userList);
		assertEquals(pageSize, userList.size());
		
		//2.pageNav 문자열 검증
		fail();
		
		
	}
	
	/**
	 * Method : calculateTotalPageCnt
	 * 최초작성일 : 2018. 5. 8.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * Method 설명 : 총페이지수 계산 테스트
	 */
	@Test
	public void calculateTotalPageCnt(){
		/***Given***/
		int userTotalCnt = 20;
		int pageSize = 10;

		/***When***/
		int pageTotalCnt = (int)Math.ceil((double)userTotalCnt/pageSize);
		
		/***Then***/
		assertEquals(2, pageTotalCnt);
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
		UserServiceInf service = new UserService();
		String mem_id = "a001";
		String mem_name = "김은대";
		String mem_pass = "asdfasdf";
		
		/***When***/
		UserVO userVO = service.getUser(mem_id);
		
		/***Then***/
		assertNotNull(userVO);
		assertEquals(mem_id, userVO.getMem_id());
		assertEquals(mem_name, userVO.getMem_name());
		assertEquals(mem_pass, userVO.getMem_pass());
	}
}
