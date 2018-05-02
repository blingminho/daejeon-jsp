package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class DefCompCdFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
	}
	
    public DefCompCdFilter() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		//전처리
		DefCompCdWrapper wrapper = new DefCompCdWrapper((HttpServletRequest)request);
		wrapper.setDefCompCd((HttpServletRequest)request);
		
		chain.doFilter(request, response);
		
		//후처리
		
	}
}
