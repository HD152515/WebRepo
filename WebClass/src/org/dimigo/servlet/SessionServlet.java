package org.dimigo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/session")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 세션에 사용자 정보가 있는지 체크 (null 체크)하고,
		// 없으면 jsp/login.jsp 포워딩
		// 있으면 jsp/sessionInfo.jsp로 포워딩(id, name, nickname을 출력)
		
		if(request.getSession().getAttribute("user")==null){
			// sendRedirect와 RequestDispatcher 같은 기능
			// sendRedirect는  set한 값이 전달이 안되고 RequestDispatcher는 전달 가능
			response.sendRedirect("jsp/login.jsp");
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("jsp/sesionInfo.jsp");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
