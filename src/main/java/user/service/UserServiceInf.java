package user.service;

import java.util.Map;

import user.model.UserVO;
/**
 * UserServiceInf.java
 *
 * @author "K.S.J"
 * @since 2018. 4. 13.
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 * 수정일 수정자 수정내용
 * ---------- ------ ------------------------
 * 2018. 4. 13. "K.S.J" 최초 생성
 *
 * </pre>
 */
public interface UserServiceInf {
	/**
	 * Method : loginProcess
	 * 최초작성일 : 2018. 4. 13.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param userVO
	 * @return
	 * Method 설명 : 로그인 프로세스
	 */
	public boolean loginProcess(UserVO userVO);
	
	/**
	 * Method : getUserPageList
	 * 최초작성일 : 2018. 5. 4.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param page
	 * @param pageSize
	 * @return
	 * Method 설명 : 회원 페이지 list 조회
	 */
	public Map<String, Object>getUserPageList(int page, int pageSize);
	
}
