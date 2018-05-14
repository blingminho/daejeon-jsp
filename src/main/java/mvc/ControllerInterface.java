package mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ControllerInterface.java
 *
 * @author "K.S.J"
 * @since 2018. 5. 14.
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 * 수정일 수정자 수정내용
 * ---------- ------ ------------------------
 * 2018. 5. 14. "K.S.J" 최초 생성
 *
 * </pre>
 */
public interface ControllerInterface {
	/**
	 * Method : process
	 * 최초작성일 : 2018. 5. 14.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param request
	 * @param response
	 * @return
	 * Method 설명 : controller 공통 처리 메서드
	 */
	public String process(HttpServletRequest request, HttpServletResponse response);
}
