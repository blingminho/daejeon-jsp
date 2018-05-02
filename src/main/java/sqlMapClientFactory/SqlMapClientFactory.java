package sqlMapClientFactory;

import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class SqlMapClientFactory {

	private static SqlMapClient client;
	static {
		try {
			Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
			client = SqlMapClientBuilder.buildSqlMapClient(rd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//end static 
	
	public static SqlMapClient getSqlMapClient(){
		return client;
	}
	
	
}
