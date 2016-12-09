package com.center;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Utility.Adminaddingbooks;

/**
 * Servlet implementation class Adminaddingbooksdetails
 */
@WebServlet("/Adminaddingbooksdetails")
public class Adminaddingbooksdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adminaddingbooksdetails() {
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
		Adminaddingbooks aBook=new Adminaddingbooks();
		String isbnnum = request.getParameter("isbnnumber");
		String bname=request.getParameter("bookname");
		String aname=request.getParameter("afor");
		String ed=request.getParameter("cpname");
		String nofb=request.getParameter("numofbooks");
		try {
			aBook.addNewbooks(isbnnum, bname, aname, ed, nofb);
			response.sendRedirect("/Students_Online_Trading_Center/BooksAddedSuc.jsp");
		} catch (NumberFormatException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
