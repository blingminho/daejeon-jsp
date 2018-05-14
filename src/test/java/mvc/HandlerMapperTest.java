package mvc;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * HandlerMapperTest.java
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
public class HandlerMapperTest {

	@Test
	public void getControllerTest() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		/***Given***/
		HandlerMapper handlerMapper = new HandlerMapper();
		
		/***When***/
		ControllerInterface controller = handlerMapper.getController("/boardList.do");
		
		
		/***Then***/
		assertNotNull(controller);
		assertEquals("mvc.board.web.BoardListController", controller.getClass().getName());
		
	}

}
