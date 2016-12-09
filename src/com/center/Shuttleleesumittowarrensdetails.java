package com.center;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Utility.Shuttleleesumittowarrens;

/**
 * Servlet implementation class Shuttleleesumittowarrensdetails
 */
@WebServlet("/Shuttleleesumittowarrensdetails")
public class Shuttleleesumittowarrensdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Shuttleleesumittowarrensdetails() {
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
		Shuttleleesumittowarrens p=new Shuttleleesumittowarrens();
		try {
			ArrayList info=p.getLeesumittowarrens();
			request.setAttribute("info", info);
			//System.out.println(info);
			request.getRequestDispatcher("/Leesumittowarrens.jsp").forward(request, response);
		//response.sendRedirect("/Students_Online_Trading_Center/WarrenstoLeesumit.jsp");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
	}

}
