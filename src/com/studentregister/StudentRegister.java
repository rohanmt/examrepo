package com.studentregister;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.database.Student;
import com.database.StudentDaoImpl;
import com.database.StudentInterface;


public class StudentRegister extends HttpServlet {
	String name;
	private static final long serialVersionUID = 1L;
    public StudentRegister() {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		String dob=request.getParameter("dob");
		String gender=request.getParameter("gender");
		String email=request.getParameter("Email");
		String cmnt=request.getParameter("comment");

		out.println("Name:"+name+"<br>");
		out.println("UserName :"+uname+"<br>");
		out.println("Password:"+pwd+"<br>");
		out.println("DOB :"+dob+"<br>");
		out.println("Gender :"+gender+"<br>");
		out.println("Email :"+email+"<br>");
		out.println("Mesasge :"+cmnt+"<br>");		
		
		Student student=new Student(uname, uname, pwd, dob, gender, email, cmnt);
		
		HttpSession session=request.getSession();
		session.setAttribute("studentSession", student);

/*******************************************************************************************************/		
/*		Used to redirect directly to login page no need to fetch values in nextx page or servlet*/
		
//		StudentInterface sDao=new StudentDaoImpl();
//		sDao.insertRecord(student);
//		response.sendRedirect("Login.html");
		
/*******************************************************************************************************/

		out.println("<html><body>"
				+ "<form action='SaveDetails' method='post'><input type='submit' value='submit' name='submit'>"
				+ "</form>"
				+ "</body></html>");

		
	}

}
