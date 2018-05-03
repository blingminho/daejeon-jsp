package listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
/**
 * RequestListener.java
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
public class RequestListener implements ServletRequestListener{
	/**
	 * Method : requestDestroyed
	 * 최초작성일 : 2018. 5. 3.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param sre
	 * Method 설명 :
	 */
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("requestDestroyed : " + ((HttpServletRequest)sre.getServletRequest()).getRequestURI());
	}

	/**
	 * Method : requestInitialized
	 * 최초작성일 : 2018. 5. 3.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param sre
	 * Method 설명 :
	 */
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("requestInitialized : " + ((HttpServletRequest)sre.getServletRequest()).getRequestURI());
	}

}
