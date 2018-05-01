package jstl;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JstlFormatDateServlet")
public class JstlFormatDateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//test date
		request.setAttribute("date", new Date());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		request.setAttribute("stringDate", sdf.format(new Date()));
		
		//time zone
		request.setAttribute("timeZoneArray", TimeZone.getAvailableIDs());
		
		
		
		
		//화면을 담당할 jsp로 위임
		request.getRequestDispatcher("/jstl/fmtDate.jsp").forward(request, response);
		
	}

}
