package com.center;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Utility.AdminReg;

/**
 * Servlet implementation class AdminRegDetails
 */
@WebServlet("/AdminRegDetails")
public class AdminRegDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminRegDetails() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    AdminReg r=new AdminReg();
		String fname = request.getParameter("firstname");
		String lname=request.getParameter("lastname");
		String dob=request.getParameter("dateofbirth");
		String pnumber=request.getParameter("phonenumber");
		String add=request.getParameter("address");
		String eaddress=request.getParameter("emailaddress");
		String pword=request.getParameter("pw");
		System.out.println("The Password is" +pword);
		r.setNewAdminReg(fname, lname, dob, pnumber, add, eaddress, pword);
		response.sendRedirect("/Students_Online_Trading_Center/AdminLoginPge.jsp");
		
	}

}
