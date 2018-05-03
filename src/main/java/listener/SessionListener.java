package listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
/**
 * SessionListener.java
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
public class SessionListener implements HttpSessionListener{
	/**
	 * Method : sessionCreated
	 * 최초작성일 : 2018. 5. 3.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param se
	 * Method 설명 :
	 */
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("sessionCreated : " + se.getSession().getId());
		
		
		
	}
	
	/**
	 * Method : sessionDestroyed
	 * 최초작성일 : 2018. 5. 3.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param se
	 * Method 설명 :
	 */
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("sessionDestroyed : " + se.getSession().getId());
		
	}

}
