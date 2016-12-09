package com.center;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Utility.UserReg;

/**
 * Servlet implementation class UserRegDetails
 */
@WebServlet("/UserRegDetails")
public class UserRegDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		UserReg u=new UserReg();
		String fname = request.getParameter("firstname");
		String lname=request.getParameter("lastname");
		String dob=request.getParameter("dateofbirth");
		String pnumber=request.getParameter("phonenumber");
		String add=request.getParameter("address");
		String eaddress=request.getParameter("emailaddress");
		String pword=request.getParameter("pw");
		System.out.println("The Password is" +pword);
		u.setNewUserReg(fname, lname, dob, pnumber, add, eaddress, pword);
		response.sendRedirect("/Students_Online_Trading_Center/UserLogin.jsp");
		
	}

}
