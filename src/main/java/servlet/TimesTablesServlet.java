package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TimesTablesServlet
 */
@WebServlet("/TimesTablesServlet")
public class TimesTablesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		
		String result = "";
		result += "<html>";
		result += "<head>";
		result += "<title>";
		result += "구구단하기";
		result += "</title>";
		result += "</head>";
		result += "<body>";
		
		result += "<table border='1px'>";
		for (int i = 1; i < 10; i++) {
			result += "<tr>";
			for (int j = 2; j < 10; j++) {
				result += "<td>";
				result += j + " * " + i + " = " + i*j;
				result += "</td>";
			}
			result += "</tr>";
		}
		
		
		
		result += "</table>";
		
		result += "</body>";
		result += "</html>";
		
		pw.write(result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
