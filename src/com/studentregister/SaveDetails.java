package com.studentregister;
import com.studentregister.StudentRegister;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.database.Student;
import com.database.StudentDaoImpl;
import com.database.StudentInterface;

public class SaveDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SaveDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
//		String name = request.getParameter("name");
//		String uname = request.getParameter("uname");
//		String pwd = request.getParameter("pwd");
//		String dob = request.getParameter("dob");
//		String gender = request.getParameter("gender");
//		String email = request.getParameter("email");
//		String comments = request.getParameter("comment");		
//		Student student= new Student(name, uname, pwd, dob, gender, email, comments);		     

		HttpSession session=request.getSession();
		Student stud=(Student) session.getAttribute("studentSession");

		StudentInterface sDao=new StudentDaoImpl();
		sDao.insertRecord(stud);
		
		session.removeAttribute("studentSession");		
		response.sendRedirect("Login.html");

//		boolean flag=  sDao.validateLogin(Login);
//		        if(flag){
//		        	RequestDispatcher rd=request.getRequestDispatcher("HomePage"); 
//                    rd.forward(request, response);
//               }else{
//     	  
//     	             response.sendRedirect("login.html");
//  s             }	
//		        

		
	}

}
