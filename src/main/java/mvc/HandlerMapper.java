package mvc;

import java.util.HashMap;
import java.util.Map;

/**
 * HandlerMapper.java
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
public class HandlerMapper {
	
	private Map<String, String> uriMapping;
	
	public HandlerMapper(){
		uriMapping = new HashMap<String, String>();
		
		//key : uri, value : controller(package + class 이름)
		uriMapping.put("/boardList.do", "mvc.board.web.BoardListController");
		uriMapping.put("/boardInsert.do", "mvc.board.web.BoardInsertController");
		uriMapping.put("/boardModify.do", "mvc.board.web.BoardModifyController");
		uriMapping.put("/boardDelete.do", "mvc.board.web.BoardDeleteController");
		
	}
	
	public ControllerInterface getController(String uri) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		String controller = uriMapping.get(uri);
		Class<ControllerInterface> clazz = (Class<ControllerInterface>) Class.forName(controller);
		ControllerInterface controllerClass = clazz.newInstance();
		return controllerClass;
	}
	
	
}
