package com.lc.android.login.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lc.android.login.entity.User;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		String userName =request.getParameter("userName");
		String password = request.getParameter("password");
		
		user.setUserName(userName);
		user.setPassword(password);
		if("q".equals(userName) && "q".equals(password)){
			user.setStatus("OK");
			user.setMessage("Login Success.");
		}else{
			user.setStatus("Fail");
			user.setMessage("Login Error.");
		}
		PrintWriter out = response.getWriter();
		out.write(user.toJson());
		out.flush();
		out.close();
		
	}

}
