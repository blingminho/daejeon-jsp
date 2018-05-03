package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
/**
 * ApplicationListener.java
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
public class ApplicationListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("contextInitialized : " + sce.getServletContext().getContextPath());
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("contextDestroyed : " + sce.getServletContext().getContextPath());
		
	}

}
