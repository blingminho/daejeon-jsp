package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NowTimeServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
//		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<head>");
//		writer.print("<meta charset='utf-8'>");
		writer.print("<title>");
		writer.print("hello world~!~~!");
		writer.print("</title>");
		writer.print("</head>");
		writer.print("<body>");
		writer.print("현재시간" + new Date());
		writer.print("</body>");
		writer.print("</html>");
		
		
		
	}
}
