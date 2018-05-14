package mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HandlerInvoker.java
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
public class HandlerInvoker {
	
	//정해진 컨트롤러를 실행, 실행결과(view name)을 리턴해준다
	public String invoke(HttpServletRequest request, 
						HttpServletResponse response, 
						ControllerInterface controller){
		return controller.process(request, response);
	}
	
	
	
	
}
