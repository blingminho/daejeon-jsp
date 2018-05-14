package mvc.board.web;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.ControllerInterface;
import mvc.board.model.BoardVO;

/**
 * BoardListController.java
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
public class BoardListController implements ControllerInterface{

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
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		
		//database에서 조회된 결과라고 가정
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		boardList.add(new BoardVO(1, "첫번째 제목입니다", "Arown", new Date()));
		boardList.add(new BoardVO(2, "두번째 제목입니다", "Brown", new Date()));
		boardList.add(new BoardVO(3, "세번째 제목입니다", "Crown", new Date()));
		boardList.add(new BoardVO(4, "네번째 제목입니다", "Drown", new Date()));
		boardList.add(new BoardVO(5, "다섯번째 제목입니다", "Erown", new Date()));
		
		request.setAttribute("boardList", boardList);
		
		//dispatcher (request) => forward:/mvc/board/view/boardList.jsp
		//redirect (response) => redirect:/mvc/board/view/boardList.jsp
		
		return "forward:/mvc/board/view/boardList.jsp";
	}
	
}
