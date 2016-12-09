package com.center;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Utility.AddingRides;

/**
 * Servlet implementation class AddRideDetails
 */
@WebServlet("/AddRideDetails")
public class AddRideDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRideDetails() {
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
		// TODO Auto-generated method stub
		AddingRides aride=new AddingRides();
		String fm = request.getParameter("from");
		String t = request.getParameter("to");
		String  doft= request.getParameter("dateoftravel");
		String stime = request.getParameter("starttime");
		String availablefor=request.getParameter("afor");
		String cname=request.getParameter("cpname");
		String pnum = request.getParameter("pnumber");
		try {
			aride.addRide(fm, t, doft, stime, availablefor, cname, pnum);
			response.sendRedirect("/Students_Online_Trading_Center/RideAddedSuc.jsp");
		} catch (NumberFormatException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
