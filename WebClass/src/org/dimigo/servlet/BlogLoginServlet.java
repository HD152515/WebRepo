package org.dimigo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.dimigo.vo.UserVo;

import com.google.gson.Gson;

/**
 * Servlet implementation class BlogLoginServlet
 */
@WebServlet("/bloglogin")
public class BlogLoginServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

   /**
    * @see HttpServlet#HttpServlet()
    */
   public BlogLoginServlet() {
      super();
      // TODO Auto-generated constructor stub
   }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
    *      response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      RequestDispatcher rd = request.getRequestDispatcher("jsp/login.jsp");
      rd.forward(request, response);
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
    *      response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      // TODO Auto-generated method stub
      request.setCharacterEncoding("utf-8");
      String id = request.getParameter("id");
      String name = "박예원";
      String pwd = request.getParameter("pwd");
      
      String em = "test@naver.com";
      
      if (id.equals(em)) {

         HttpSession session = request.getSession();
         
         UserVo user = new UserVo();
         user.setId(id);
         user.setName(name);

         session.setAttribute("user", user);

//         RequestDispatcher rd = request.getRequestDispatcher("myblog/main.jsp");
//         rd.forward(request, response);
         
         response.sendRedirect("jsp/main.jsp");
         
      }
      
      else {
         request.setAttribute("msg", "error");
         
         RequestDispatcher rd = request.getRequestDispatcher("jsp/login.jsp");
         rd.forward(request, response);
      }
   }
}