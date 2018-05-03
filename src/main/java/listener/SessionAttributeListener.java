package listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
/**
 * SessionAttributeListener.java
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
public class SessionAttributeListener implements HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent se) {
		System.out.println("attributeAdded : " + se.getName() + " / " + se.getValue());
		
		
		
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent se) {
		System.out.println("attributeRemoved : " + se.getName() + " / " + se.getValue());
		
		
		
		
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent se) {
		// TODO Auto-generated method stub

	}

}
