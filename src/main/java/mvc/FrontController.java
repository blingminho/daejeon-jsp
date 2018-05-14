package mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * FrontController.java
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
//boardList.do
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private HandlerMapper handlerMapper;
	private HandlerInvoker handlerInvoker;
	private ViewResolver viewResolver;

    public FrontController() {
        super();
        handlerMapper = new HandlerMapper();
        handlerInvoker = new HandlerInvoker();
        viewResolver = new ViewResolver();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String requestUri = request.getRequestURI();
			requestUri = requestUri.substring(request.getContextPath().length());
			
			ControllerInterface controller = handlerMapper.getController(requestUri);
			
			String viewInfo = handlerInvoker.invoke(request, response, controller);
			
			viewResolver.viewResolve(request, response, viewInfo);
			
			
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
