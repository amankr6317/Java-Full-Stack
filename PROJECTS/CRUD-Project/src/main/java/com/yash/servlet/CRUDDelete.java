package com.yash.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.dao.CRUDDao;

/**
 * Servlet implementation class CRUDDelete
 */
@WebServlet("/CRUDDelete")
public class CRUDDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String ID = request.getParameter("id");
		int id = Integer.parseInt(ID);
//		System.out.println(id);
		CRUDDao.delete(id);
		response.sendRedirect("deleteEmp.jsp");
		
	}

}
