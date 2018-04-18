package student.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.model.StudentVO;
import student.service.StudentService;
import student.service.StudentServiceInf;

/**
 * StudentServlet.java
 *
 * @author "K.S.J"
 * @since 2018. 4. 18.
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 * 수정일 수정자 수정내용
 * ---------- ------ ------------------------
 * 2018. 4. 18. "K.S.J" 최초 생성
 *
 * </pre>
 */
@WebServlet("/memberList")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static StudentServiceInf service = StudentService.getInstance();
	private static List<StudentVO> studentList;
	
	public StudentServlet() {
		studentList = service.getStudentAll();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		studentList = service.getStudentAll();
		request.setAttribute("studentList", studentList);
		System.out.println("request.getContextPath() : " + request.getContextPath());
		RequestDispatcher rd = request.getRequestDispatcher("student/student.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
