package filter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/defCompCdServlet")
public class DefCompCdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DefCompCdServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DefCompCdServlet doPost");
		System.out.println(request.getParameter("userId"));
		System.out.println(request.getParameter("unt_cd"));
		
		
	}

}
