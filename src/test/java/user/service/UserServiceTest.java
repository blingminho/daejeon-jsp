package user.service;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Test;

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

}
