package tagDao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import sqlMapClientFactory.SqlMapClientFactory;

import com.ibatis.sqlmap.client.SqlMapClient;
/**
 * TagsCodeDao.java
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
public class TagsCodeDao implements TagsCodeDaoInf {
	
	private static TagsCodeDaoInf dao = new TagsCodeDao();
	
	private SqlMapClient smc = null;
	
	private TagsCodeDao() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static TagsCodeDaoInf getInstance(){
		return dao;
	}
	
	@Override
	public List<Map<String, String>> getProdList(String prod_lgu) {
		List<Map<String, String>> list = null;
		try {
			list = smc.queryForList("prod.getProdList", prod_lgu);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
