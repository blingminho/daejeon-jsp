package tagDao;

import java.util.List;
import java.util.Map;

/**
 * TagsCodeDaoInf.java
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
public interface TagsCodeDaoInf {
	
	/**
	 * Method : getProdList
	 * 최초작성일 : 2018. 5. 2.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param prod_lgu PROD테이블의 prod_lgu속성값
	 * @return prod_id, prod_name을 가진 map List
	 * Method 설명 : prod_lgu를 조건으로하여 검색한 결과를 List로 반환
	 */
	List<Map<String, String>> getProdList(String prod_lgu);
	
	
}