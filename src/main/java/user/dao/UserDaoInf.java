package user.dao;

import java.util.List;

import user.model.UserVO;

/**
 * UserDaoInf.java
 *
 * @author "K.S.J"
 * @since 2018. 5. 3.
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 * 수정일 수정자 수정내용
 * ---------- ------ ------------------------
 * 2018. 5. 3. "K.S.J" 최초 생성
 *
 * </pre>
 */
public interface UserDaoInf {
	
	/**
	 * Method : getUserPageList
	 * 최초작성일 : 2018. 5. 3.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param page
	 * @param pageSize
	 * @return
	 * Method 설명 : 회원 페이지 list 조회
	 */
	public List<UserVO> getUserPageList(int page, int pageSize);
	
	/**
	 * Method : getUserTotalCnt
	 * 최초작성일 : 2018. 5. 4.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @return
	 * Method 설명 : 전체 유저 건수 조회
	 */
	public int getUserTotalCnt(); 
	
	/**
	 * Method : getUser
	 * 최초작성일 : 2018. 5. 8.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param mem_id
	 * @return
	 * Method 설명 : 회원 상세정보 조회
	 */
	public UserVO getUser(String mem_id);

	/**
	 * Method : insertUser
	 * 최초작성일 : 2018. 5. 9.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param userVO
	 * Method 설명 : 사용자 신규 입력
	 * @return 
	 */
	public int insertUser(UserVO userVO);
	
	/**
	 * Method : deleteUser
	 * 최초작성일 : 2018. 5. 10.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param userVO
	 * @return
	 * Method 설명 : 기존 사용자 삭제
	 */
	public int deleteUser(UserVO userVO);
	
	/**
	 * Method : modifyUser
	 * 최초작성일 : 2018. 5. 11.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param userVO
	 * @return
	 * Method 설명 : 기존 사용자 정보 수정
	 */
	public int modifyUser(UserVO userVO);
}
