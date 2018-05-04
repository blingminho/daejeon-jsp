package user.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import user.dao.UserDao;
import user.dao.UserDaoInf;
import user.model.UserVO;

public class UserService implements UserServiceInf{
	
	private UserDaoInf userDao;
	
	private List<UserVO> userList;
	
	public UserService() {
		userDao = new UserDao();
		userList = new ArrayList<UserVO>();
		userList.add(new UserVO("brown", "brown", "brownpass"));
		userList.add(new UserVO("cony", "cony", "conypass"));
		userList.add(new UserVO("sally", "sally", "sallypass"));
		userList.add(new UserVO("moon", "moon", "moonpass"));
		
	}
	
	/**
	 * Method : loginProcess
	 * 최초작성일 : 2018. 4. 13.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param userVO
	 * @return
	 * Method 설명 : 로그인 프로세스
	 */
	@Override
	public boolean loginProcess(UserVO userVO) {
		String userId = userVO.getUserId();
		String password = userVO.getPassword();
		
		for (UserVO userDB : userList) {
			String dbId = userDB.getUserId();
			String dbPw = userDB.getPassword();
			
			if (dbId.equals(userId) && dbPw.equals(password)) {
				return true;
			}
		}
		return false;
	}

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
	@Override
	public Map<String, Object> getUserPageList(int page, int pageSize) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		List<UserVO> userList = userDao.getUserPageList(page, pageSize);
		
		String pageNav = makePageNav(page, userDao.getUserTotalCnt());
		
		resultMap.put("userList", userList);
		resultMap.put("pageNav", pageNav);
		
		return resultMap;
	}

	private String makePageNav(int page, int userTotalCnt) {
		StringBuffer pageNav = new StringBuffer();
		pageNav.append("<nav>");
		pageNav.append("	<ul class=\"pagination\">");
		pageNav.append("			<li><a href=\"jsp/getUserPageList?page=1&pageSize=10\" aria-label=\"Previous\">");
		pageNav.append("			<span aria-hidden=\"true\">&laquo;</span></a></li>");
		
		pageNav.append("			<li><a href=\"#\">1</a></li>");
		
		pageNav.append("			<li><a href=\"#\" aria-label=\"Next\">");
		pageNav.append("				<span aria-hidden=\"true\">&raquo;</span>");
		pageNav.append("			</a></li></ul></nav>");
		
		
		
		
		
		
		
		
		
		return pageNav.toString();
	}
	
}
