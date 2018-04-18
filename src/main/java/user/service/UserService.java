package user.service;

import java.util.ArrayList;
import java.util.List;

import user.model.UserVO;

public class UserService implements UserServiceInf{
	
	private List<UserVO> userList;
	
	public UserService() {
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
	
}
