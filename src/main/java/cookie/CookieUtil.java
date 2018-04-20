package cookie;

public class CookieUtil {
	
	/**
	 * Method : getCookie
	 * 최초작성일 : 2018. 4. 19.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @param cookieString
	 * @param cookie
	 * @return
	 * Method 설명 : 쿠키 문자열로부터 cookie 쿠키 값을 받아온다
	 */
	public String getCookie(String cookieString, String cookie) {
		//쿠키 문자열에 해당 쿠키가 없을때 (공백을 반환)
		int index = 0;
		if ((index = cookieString.indexOf(cookie)) < 0) {
			return "";
		//쿠키 문자열에 쿠키가 존재하는 경우
		} else {
			String[] cookies = cookieString.split("; ");
			
			for (String tmpCookie : cookies) {
				tmpCookie = tmpCookie.substring(cookie.length() + 1);
				//쿠키를 찾은경우
				if (tmpCookie.indexOf(cookie) > 0) {
					return tmpCookie;
				}
				
				
			}
			
			
			
			
			
		}
		
		String result = "";
		
		
		return "scUcJs4Z6qKpotGq9UHl6oNuvoE5qqSSfJvC0k+xYXFmTq25NA7EYzfY5Hg1qdhOCA==";
	}
	
}
