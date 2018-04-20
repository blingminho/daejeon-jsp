package cookie;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
/**
 * CookieTest.java
 *
 * @author "K.S.J"
 * @since 2018. 4. 19.
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 * 수정일 수정자 수정내용
 * ---------- ------ ------------------------
 * 2018. 4. 19. "K.S.J" 최초 생성
 *
 * </pre>
 */
public class CookieTest {
	
	/**
	 * Method : createCookieUtilTest
	 * 최초작성일 : 2018. 4. 19.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * Method 설명 : cookieUtil 객체 생성 테스트
	 */
	@Test
	public void createCookieUtilTest() {
		/***Given***/
		
		/***When***/
		CookieUtil cookieUtil = new CookieUtil();
		
		/***Then***/
		assertNotNull(cookieUtil);
	}
	
	/**
	 * Method : test
	 * 최초작성일 : 2018. 4. 19.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * Method 설명 : 쿠키 이름으로 쿠키 값을 받아온다
	 */
	@Test
	public void getCookieTest() {
		/***Given***/
		CookieUtil cookieUtil = new CookieUtil();
		String cookieString = "NNB=NB3TEL3XXFAVU; npic=scUcJs4Z6qKpotGq9UHl6oNuvoE5qqSSfJvC0k+xYXFmTq25NA7EYzfY5Hg1qdhOCA==; _ga=GA1.2.1072676048.1514266281; NaverSuggestUse=use%26unuse; ASID=01d49d9200000161fed7c6e70000005b; nx_ssl=2; PM_CK_latestPanelDate=20180322; nid_iplevel=1; PM_CK_rcode=07140105";
		String cookie = "npic";
		
		/***When***/
		String cookieValue = cookieUtil.getCookie(cookieString, cookie);
		
		/***Then***/
		assertEquals("scUcJs4Z6qKpotGq9UHl6oNuvoE5qqSSfJvC0k+xYXFmTq25NA7EYzfY5Hg1qdhOCA==", cookieValue);
	}

}
