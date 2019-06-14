package com.homepage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Homepage extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Homepage() {
        super();
    }
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
    	PrintWriter out=response.getWriter();
    	RequestDispatcher rd=request.getRequestDispatcher("Home.html");
    	rd.include(request, response);
    	out.println("<html><body>"
    			+ "<h1>hi hello</h1>"
    			+ "</body></html>");
    }

}
