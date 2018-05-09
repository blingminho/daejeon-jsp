package filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class RequestCountFilter implements Filter {
	private Map<String, Integer> counterMap;
	
	public void init(FilterConfig fConfig) throws ServletException {
		counterMap = new HashMap<String, Integer>();
		
		ServletContext application = fConfig.getServletContext();
		application.setAttribute("counterMap", counterMap);
		
		
		
	}

	public RequestCountFilter() {
	}
	
	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");
		
		/*전처리*/
		System.out.println("RequestCountFilter 전처리");
		//uri별로 카운팅 횟수를 저장 : 통계 자료 생성
		HttpServletRequest hsRequest = (HttpServletRequest)request;
//		System.out.println("doFilter : " + hsRequest.getRequestURI());
		String uri = hsRequest.getRequestURI();
		
		ServletContext application = hsRequest.getServletContext();
		Map<String, Integer> counterMap = (Map<String, Integer>)application.getAttribute("counterMap");
		
		Integer count = counterMap.get(uri);
		
		if (count == null)
			counterMap.put(uri, 1);
		else
			counterMap.put(uri, ++count);
		
		
		
		//다음filter를 요청하거나, filter가 더이상 없을경우
		//url에 해당하는 요청을 처리하는 서블릿으로 요청 전달
		chain.doFilter(request, response);
		
		/*후처리*/
		System.out.println("RequestCountFilter 후처리");
	}


}
