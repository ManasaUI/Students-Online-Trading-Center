package com.center;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Utility.AdminLogin;
import Utility.UserLogin;

/**
 * Servlet implementation class UserLoginDetails
 */
@WebServlet("/UserLoginDetails")
public class UserLoginDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginDetails() {
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
		 System.out.println("Okay I am trying to Login to the system");
			
			String eaddress=request.getParameter("emailaddress");
			String pword=request.getParameter("pw");
			HttpSession ss = request.getSession();
			ss.setAttribute("email", eaddress);
			ss.setAttribute("pass", pword);
			ArrayList info = new ArrayList();
			UserLogin ul=new UserLogin();
			info = ul.getUserlogindetails(eaddress, pword);
			if(info.size()!=0)
			{
				ss.setAttribute("information", info);
				RequestDispatcher dispatcher=request.getRequestDispatcher("/UserHome.jsp");
				dispatcher.forward(request, response);
			}
			else
			{
				response.sendRedirect("/Students_Online_Trading_Center/UserWrongLoginDetails.jsp");
			}
			}

		// TODO Auto-generated method stub
	}


