package filter;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
/**
 * DefCompCdWrapper.java
 *
 * @author "K.S.J"
 * @since 2018. 5. 2.
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 * 수정일 수정자 수정내용
 * ---------- ------ ------------------------
 * 2018. 5. 2. "K.S.J" 최초 생성
 *
 * </pre>
 */
public class DefCompCdWrapper extends HttpServletRequestWrapper{
	
	private Map<String, String[]> parameterMap = null;
	
	public DefCompCdWrapper(HttpServletRequest request) {
		super(request);
		
		parameterMap = new HashMap<String, String[]>(request.getParameterMap());
		
		
	}
	
	public String getParameter(String name) {
		String[] values = parameterMap.get(name);
		
		if (values == null)
			return null;
		else
			return values[0];
	}
	
	public String[] getParameterValues(String name) {
		return parameterMap.get(name);
	}
	
	public Map<String, String[]> getParameterMap() {
		return parameterMap;
	}
	
	public Enumeration<String> getParameterNames() {
		return Collections.enumeration(parameterMap.keySet());
	}
	
	/**
	 * Method : setDefCompCd
	 * 최초작성일 : 2018. 5. 2.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param request
	 * Method 설명 : 회사코드가 parameter에 없을경우 기본 회사코드를 설정해준다.
	 */
	public void setDefCompCd(HttpServletRequest request) {
		
		//회사코드(name : unt_cd)가 있는지 확인후 없을경우 기본값으로 설정
		String unt_cd = request.getParameter("unt_cd");
		
		if (unt_cd == null)
			parameterMap.put("unt_cd", new String[]{"DDIT"});
		
		
	}
	
	
}
