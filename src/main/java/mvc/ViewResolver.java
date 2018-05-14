package mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ViewResolver.java
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
public class ViewResolver {
	private final String FORWARD = "forward:";
	private final String REDIRECT = "redirect:";
	
	/**
	 * Method : viewResolve
	 * 최초작성일 : 2018. 5. 14.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param request
	 * @param response
	 * @param viewInfo
	 * Method 설명 : viewInfo를 분석하여 view에 위임
	 * @throws IOException 
	 * @throws ServletException 
	 */
	public void viewResolve(HttpServletRequest request, HttpServletResponse response, String viewInfo) throws ServletException, IOException {
		
		if (viewInfo.startsWith(FORWARD)) {
			//vieInfo : "forward:/mvc/board/view/boardList.jsp"
			viewInfo = viewInfo.substring(FORWARD.length());
			request.getRequestDispatcher(viewInfo).forward(request, response);
			
		} else if (viewInfo.startsWith(REDIRECT)) {
			viewInfo = viewInfo.substring(REDIRECT.length());
			response.sendRedirect(viewInfo);
			
		} else {
			System.out.println("존재하지 않는 방식입니다");
		}
		
		
	}
	
}
